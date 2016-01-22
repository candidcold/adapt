package com.candidcold.adapt;

import com.candidcold.adapt.albums.Album;
import com.candidcold.adapt.combined.comics.Comic;
import com.candidcold.adapt.combined.shows.Show;

import java.util.ArrayList;

/**
 * Created by davidmorant on 1/17/16.
 */
public class ModelManager {
    private String gangsta_ipsum = "Phasellizzle boofron mah nizzle tellus. Fo shizzle fo shizzle adipiscing lorizzle." +
            " Donec nizzle est. Phat sapizzle bling bling, ultrices gangsta, accumsizzle funky fresh, fermentizzle dang," +
            " black. Fo shizzle my nizzle boom shackalack mammasay mammasa mamma oo sa. Etizzle rutrum break yo neck, yall ante." +
            " Sizzle . Vestibulizzle ut mofo crazy pimpin' commodo commodo. Get down get down ipsum i saw beyonces tizzles and my pizzle " +
            "went crizzle sizzle check it out, consectetizzle pot elizzle. Sizzle izzle mi. Check out this mi phat, sodalizzle owned, shizzle" +
            " my nizzle crocodizzle a, shut the shizzle up a, bizzle.";

    private String comics_ipsum = "New roster. Veil. The instructors at Avengers Academy hope to steer these super-powered and highly-troubled teens in the right direction, but twists and turns abound. Reptil.\n" +
            "\n" +
            "Meet all of Spideys deadly enemies, from the Green Goblin and Doctor Octopus to Venom and Carnage, plus see Peter Parker fall in love, face tragedy and triumph, and learn that with great power comes great responsibility. Youve found it. The Avengers return. At the dawn of the Heroic Age, the Avengers will assemble once again.\n" +
            "\n" +
            "Striker. Vowing to serve his country any way he could, young Steve Rogers took the super soldier serum to become Americas one-man army. This is where youll find all the big-time action, major storylines and iconic Spider-Man magic youd come to expect from the Wall-Crawler. Youve found it.";

    private String tv_ipsum = "These Happy Days are yours and mine Happy Days. Maybe you and me were never meant to be. But baby think of me once in awhile. I'm at WKRP in Cincinnati. It's a beautiful day in this neighborhood a beautiful day for a neighbor. Would you be mine? Could you be mine? Its a neighborly day in this beautywood a neighborly day for a beauty. Would you be mine? Could you be mine. Just two good ol' boys Never meanin' no harm. Beats all you've ever saw been in trouble with the law since the day they was born? The mate was a mighty sailin' man the Skipper brave and sure. Five passengers set sail that day for a three hour tour a three hour tour. Sunday Monday Happy Days. Tuesday Wednesday Happy Days. Thursday Friday Happy Days.Saturday what a day. Groovin' all week with you. Sunday Monday Happy Days. Tuesday Wednesday Happy Days. Thursday Friday Happy Days.Saturday what a day. Groovin' all week with you. But they got diff'rent strokes. It takes diff'rent strokes - it takes diff'rent strokes to move the world. Today still wanted by the government they survive as soldiers of fortune. Here he comes Here comes Speed Racer. He's a demon on wheels.\n" +
            "\n" +
            ", So this is the tale of our castaways they're here for a long long time. They'll have to make the best of things its an uphill climb. One two three four five six seven eight Sclemeel schlemazel hasenfeffer incorporated.\n" +
            "\n" +
            "Come and dance on our floor. Take a step that is new. We've a loveable space that needs your face threes company too. And if you threw a party - invited everyone you knew. You would see the biggest gift would be from me and the card attached would say thank you for being a friend. But they got diff'rent strokes. It takes diff'rent strokes - it takes diff'rent strokes to move the world. And we'll do it our way yes our way. Make all our dreams come true for me and you.\n" +
            "\n" +
            "Believe it or not I'm walking on air. I never thought I could feel so free. Flying away on a wing and a prayer. Who could it be? Believe it or not its just me. And you know where you were then. Girls were girls and men were men. Mister we could use a man like Herbert Hoover again. Love exciting and new. Come aboard were expecting you. Love life's sweetest reward Let it flow it floats back to you. Baby if you've ever wondered - wondered whatever became of me. I'm living on the air in Cincinnati. Cincinnati WKRP. And when the odds are against him and their dangers work to do. You bet your life Speed Racer he will see it through. So this is the tale of our castaways they're here for a long long time. They'll have to make the best of things its an uphill climb. And we'll do it our way yes our way. Make all our dreams come true for me and you. Here he comes Here comes Speed Racer. He's a demon on wheels. Sunny Days sweepin' the clouds away. On my way to where the air is sweet. Can you tell me how to get how to get to Sesame Street.\n" +
            "\n" +
            "Texas tea., \"It's time to put on makeup. It's time to dress up right. It's time to raise the curtain on the Muppet Show tonight.\" Flying away on a wing and a prayer. Who could it be? Believe it or not its just me? But they got diff'rent strokes. It takes diff'rent strokes - it takes diff'rent strokes to move the world. I have always wanted to have a neighbor just like you. I've always wanted to live in a neighborhood with you. Fish don't fry in the kitchen and beans don't burn on the grill. Took a whole lotta tryin' just to get up that hill. Why do we always come here? I guess well never know. Its like a kind of torture to have to watch the show.";

    public ArrayList<Album> getAlbumList() {
        ArrayList<Album> albums = new ArrayList<>();

        albums.add(new Album("90059",
                             "Jay Rock",
                             gangsta_ipsum,
                             R.drawable.ninedoubleofiveninealbumcover,
                             /*Add in album length*/ 10));

        albums.add(new Album("good kid, m.A.A.d city",
                             "Kendrick Lamar",
                             gangsta_ipsum,
                             R.drawable.gkmcalbumcover,
                             /*Add in album length*/  14));

        albums.add(new Album("Control System",
                             "Ab-Soul",
                             gangsta_ipsum,
                             R.drawable.controlsystemalbumcover,
                             /*Add in album length*/ 16));

        albums.add(new Album("Z",
                             "SZA",
                             gangsta_ipsum,
                             R.drawable.zalbumcover,
                             /*Add in album length*/ 10));

        albums.add(new Album("Oxymoron",
                             "ScHoolboy Q",
                             gangsta_ipsum,
                             R.drawable.oxymoronalbumcover,
                             /*Add in album length*/ 14));

        albums.add(new Album("Habits and Contradictions",
                             "ScHoolboy Q",
                             gangsta_ipsum,
                             R.drawable.handcalbumcover,
                             /*Add in album length*/ 18));

        albums.add(new Album("Section.80",
                             "Kendrick Lamar",
                             gangsta_ipsum,
                             R.drawable.section80albumcover,
                             /*Add in album length*/ 15));

        albums.add(new Album("To Pimp A Butterfly",
                             "Kendrick Lamar",
                             gangsta_ipsum,
                             R.drawable.tpababumcover,
                             /*Add in album length*/ 15));

        albums.add(new Album("These Days",
                             "Ab-Soul",
                             gangsta_ipsum,
                             R.drawable.thesedaysalbumcover,
                             /*Add in album length*/ 14));

        albums.add(new Album("Cilvia Demo",
                             "Isaiah Rashad",
                             gangsta_ipsum,
                             R.drawable.cilviaalbumcover,
                             /*Add in album length*/ 13));

        return albums;
    }

    public ArrayList<Show> getShowList() {
        ArrayList<Show> shows = new ArrayList<>();

        shows.add(new Show(R.drawable.madmens5,
                           "Mad Men",
                           tv_ipsum,
                           "AMC"));

        shows.add(new Show(R.drawable.seinfeld,
                           "Seinfeld",
                           tv_ipsum,
                           "NBC"));

        shows.add(new Show(R.drawable.breakingbads5,
                           "Breaking Bad",
                           tv_ipsum,
                           "AMC"));

        shows.add(new Show(R.drawable.californications3,
                           "Californication",
                           tv_ipsum,
                           "Showtime"));

        shows.add(new Show(R.drawable.jessicajones,
                           "Jessica Jones",
                           tv_ipsum,
                           "Netflix"));

        shows.add(new Show(R.drawable.thewires3,
                           "The Wire",
                           tv_ipsum,
                           "HBO"));

        shows.add(new Show(R.drawable.theboondocks,
                           "The Boondocks",
                           tv_ipsum,
                           "Adult Swim / BET"));

        return shows;
    }

    public ArrayList<Comic> getComicList() {
        ArrayList<Comic> comics = new ArrayList<>();

        comics.add(new Comic(R.drawable.astonishingxmen,
                             "Astonishing X-Men",
                             "Joss Whedon",
                             comics_ipsum));

        comics.add(new Comic(R.drawable.brubakercap,
                             "Captain America",
                             "Ed Brubaker",
                             comics_ipsum));

        comics.add(new Comic(R.drawable.ddbendis,
                             "Daredevil",
                             "Brian Michael Bendis",
                             comics_ipsum));

        comics.add(new Comic(R.drawable.ffhickman,
                             "Fantastic Four",
                             "Jonathan Hickman",
                             comics_ipsum));

        comics.add(new Comic(R.drawable.carol06,
                             "Ms. Marvel",
                             "Brian Reed",
                             comics_ipsum));

        comics.add(new Comic(R.drawable.secretwars9,
                             "Secret Wars",
                             "Jonathan Hickman",
                             comics_ipsum));

        return comics;
    }

}
