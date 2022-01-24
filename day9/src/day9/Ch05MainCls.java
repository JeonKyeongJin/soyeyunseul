package day9;

import java.util.Scanner;


//------------------ Model ---------------
class Music {
// 가수, 노래
private String type;
private String song;
public Music(String song, String type) {
   this.type = type;
   this.song = song;
}

public String getSong() {
   return song;
}

public void play() {
   System.out.printf("%s type의 %s가 실행됩니다. ", type, song);
}
}

class DanceMusic extends Music {
private String name;
public DanceMusic(String name, String song, String type) {
   super(song, type);
   this.name = name;
}
@Override
public void play() {
   super.play();
   System.out.printf("가수는 %s입니다.\n", name);
}
}

class NCSMusic extends Music {
public NCSMusic(String song, String type) {
   super(song, type);
}

@Override
public void play() {
   super.play();
   System.out.println("No Copyrignt Sound!");
}
}

class DataAccessModel {
public static final int MAX = 12;
private Music[] musicList = new Music[MAX];
private int top = 0;

public void appendMusic(Music music) {
   // 음악 추가 - top이 MAX이상이면 추가 불가능.
   if(music != null) {
      musicList[top++] = music;
      System.out.println(">>> 음악 추가 성공 : " + music.getSong());
   }
}
public Music removeMusic(int idx) {
   // top이 0이하이면 제거가 불가능.
   Music music = musicList[idx];
   for(int i = idx; i<top-1; i++) {
      musicList[i] = musicList[i+1];
   }
   top--;
   return music;
}
public Music findMusic(Music music) {
   // 음악 검색
   Music findMusic = null;
   for(int i=0; i<top; i++) {
      if((music.getSong()).equals(musicList[i].getSong()) ) {
         findMusic = musicList[i];
      }
   }
   
   return findMusic;
}
public Music[] getAllMuic() {
   // 모든 음악 실행
   return musicList;
}
}
//---------------- end of Model -------------------

//----------------- View (화면에 보여지는 내용) ------------------
class ViewPage {
// 뷰페이지 구현 하는 부분
}

class ViewContainer {
// 뷰를 보여지게 하는 부분
}
//----------------- End of View (화면에 보여지는 내용) ------------

//------------------ Controller (제어문) ----------------
class MusicPlayer {
// 제어하는 곳
}
//------------------ End of Controller (제어문) ----------

public class Ch05MainCls {
public static void main(String[] args) {
   DataAccessModel dam = new DataAccessModel();    // DAO 패턴
   dam.appendMusic(new DanceMusic("엄정화", "페스티발", "디스코"));   // VO 패턴
   dam.appendMusic(new DanceMusic("조용필", "바람의노래", "트로트"));
   dam.appendMusic(new NCSMusic("아무튼 노래", "팝"));
   dam.appendMusic(new NCSMusic("좋은 배경음악", "째즈"));
   
   Music[] musicList = dam.getAllMuic();
   for(int i=0; i<musicList.length; i++) {
      if(musicList[i] == null) break;
      System.out.print(i + "> ");
      musicList[i].play();
   }
   
   Music m1 = dam.findMusic(null);
}
}