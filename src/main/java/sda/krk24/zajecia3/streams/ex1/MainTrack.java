package sda.krk24.zajecia3.streams.ex1;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class MainTrack {
    public static void main(String[] args) {
        ex8();
    }

    private static void ex6() {
        //6. Używając streamów, wskaż te albpumy, których nazwa zespołu rozpoczyna się od litery T
        Set<Album> collect = getAlbums().stream()
                .filter(x -> x.getBandName().startsWith("t")
                        || x.getBandName().startsWith("T"))
                .collect(Collectors.toSet());
//                .forEach(System.out::println);
    }

    private static void ex7() {
        //7. Używając streamów wskaż łączny czas trwania w sekundach
// utworów w albumach których cena jest większa niz 50

        //tracki ktore sa w albumach o cenie wiekszej niz 50
        List<Track> tracks = getAlbums().stream()
                .filter(x -> x.getPrice() > 50)
                .flatMap(x -> x.getTracks().stream())
                .collect(Collectors.toList());

        //suma czasu trwania poszczegolnych trackow
        int sum = 0;
        for (Track track : tracks) {
            sum += track.getDuration();
        }

        int sumStream = tracks.stream()
                .map(x -> x.getDuration())
                .reduce(0L, (x, y) -> x + y)
                .intValue();

        System.out.println(sum + " " + sumStream);
    }

    private static void ex8() {
        //Używając streamów wybierz te albumy których
        // cena albumu jest większa od 30 a suma czasu trwania utworow
        // jest wieksza niz 20 minut

        List<Album> collected = getAlbums().stream()
                .filter(album -> album.getPrice() > 30)
                .filter(album -> album.getTracks().stream()
                        .map(Track::getDuration)
                        .reduce(0L, Long::sum)
                        .intValue() > (20 * 60))
                .collect(Collectors.toList());

        //lista utworow w albumach ktore ... jw.
        List<Track> tracks = collected
                .stream()
                .flatMap(x -> x.getTracks().stream())
                .collect(Collectors.toList());

    }

    static void ex9() {
        //Określ cenę wszystkich albumow znajdujących się w liście albums
        BinaryOperator<Integer> sumForAlbumPrices = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        }; //klasa anonimowa
        sumForAlbumPrices = (x, y) -> x + y; //wyrazenie lambda
        sumForAlbumPrices = Integer::sum; //referencja metody

        Integer apply = sumForAlbumPrices.apply(4, 6);
        System.out.println(apply);

        Integer sum = getAlbums().stream()
                .map(album -> album.getPrice())
                .reduce(0, sumForAlbumPrices);
        System.out.println(sum);
    }

    @NotNull
    private static List<Album> getAlbums() {
        List<Album> albums = new ArrayList<>();
        List<Track> tracksToAlbum = new ArrayList<>();
        tracksToAlbum.add(new Track("tr1", 40));
        tracksToAlbum.add(new Track("tr2", 120));
        tracksToAlbum.add(new Track("tr3", 50));

        Album acdcAlbum = new Album(tracksToAlbum, "tACDC", 60);
        albums.add(acdcAlbum);
        return albums;
    }
}
