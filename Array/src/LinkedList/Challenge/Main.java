package LinkedList.Challenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static ArrayList<Album> albums=new ArrayList<Album>();

    public static void main(String[] args) {
        Album album=new Album("Stormbringer","Deep Purple");
        album.addSong("StormBringer",4.6);
        album.addSong("holy man",4.22);
        album.addSong("hold on",4.3);
        album.addSong("double dealer",5.6);
        album.addSong("Cant do it right",3.21);
        album.addSong("Ball shooter",6.23);
        album.addSong("The gypsy",4.27);
        album.addSong("Just song",3.43);
        album.addSong("Soldier of fortune",3.13);

        albums.add(album);

        album=new Album("For those about to rock","AC/DC");
        album.addSong("For those about to rock",5.44);
        album.addSong("Finger",3.45);
        album.addSong("lets go",4.44);
        album.addSong("Venom",2.34);
        album.addSong("COD",6.47);
        album.addSong("Break",5.54);
        album.addSong("The",3.16);
        album.addSong("Rules",4.423);
        albums.add(album);

        LinkedList<Song>playList=new LinkedList<Song>();
        albums.get(0).addToPlayList("Cant do it right",playList);
        albums.get(0).addToPlayList("StormBringer",playList);
        albums.get(0).addToPlayList("shooter",playList); // doesn't exist validation
        albums.get(0).addToPlayList(9,playList);
        albums.get(1).addToPlayList(8,playList);
        albums.get(1).addToPlayList(3,playList);
        albums.get(1).addToPlayList(2,playList);
        albums.get(1).addToPlayList(22,playList);// doesn't exist validation

        play(playList);

    }

    public static void play(LinkedList<Song> playList){
        Scanner scanner=new Scanner(System.in);
        boolean quit=false;
        boolean forward=true;
        ListIterator<Song>listIterator=playList.listIterator();
        if(playList.size()==0){
            System.out.println("No songs in playlist");
            return;
        }else{
            System.out.println("Now playing "+listIterator.next().toString());
        }

        while(!quit){
            int action=scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    System.out.println("Playlist complete.");
                    quit=true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward=true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing "+listIterator.next().toString());
                    }else
                        System.out.println("Reach the end of the playlist");
                    forward=false;
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward=false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing "+listIterator.previous().toString());
                    }else{
                        System.out.println("Start of the playing");
                        forward =true;
                    }
                    break;
                case 3:
                    break;
                case 4:
//                    printList(playList);
                    break;
                case 5:
//                    printMenu();
                    break;
            }
        }
    }
}
