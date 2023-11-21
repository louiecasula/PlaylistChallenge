package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int songIndex = 0;
        for (int i = 0; i < playList.length; i++){
            if (playList[i].equals(selection)){
                songIndex = i;
            }
        }
        int presses = songIndex - startIndex;
        if (presses < 0){
            presses *= -1;
        }
        if (presses > playList.length / 2){
            return playList.length - presses;
        }
        else{
            return presses;
        }
    }
}
