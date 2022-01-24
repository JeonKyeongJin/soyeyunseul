package day9;

import java.util.Scanner;


//------------------ Model ---------------
class Music {
// ����, �뷡
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
   System.out.printf("%s type�� %s�� ����˴ϴ�. ", type, song);
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
   System.out.printf("������ %s�Դϴ�.\n", name);
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
   // ���� �߰� - top�� MAX�̻��̸� �߰� �Ұ���.
   if(music != null) {
      musicList[top++] = music;
      System.out.println(">>> ���� �߰� ���� : " + music.getSong());
   }
}
public Music removeMusic(int idx) {
   // top�� 0�����̸� ���Ű� �Ұ���.
   Music music = musicList[idx];
   for(int i = idx; i<top-1; i++) {
      musicList[i] = musicList[i+1];
   }
   top--;
   return music;
}
public Music findMusic(Music music) {
   // ���� �˻�
   Music findMusic = null;
   for(int i=0; i<top; i++) {
      if((music.getSong()).equals(musicList[i].getSong()) ) {
         findMusic = musicList[i];
      }
   }
   
   return findMusic;
}
public Music[] getAllMuic() {
   // ��� ���� ����
   return musicList;
}
}
//---------------- end of Model -------------------

//----------------- View (ȭ�鿡 �������� ����) ------------------
class ViewPage {
// �������� ���� �ϴ� �κ�
}

class ViewContainer {
// �並 �������� �ϴ� �κ�
}
//----------------- End of View (ȭ�鿡 �������� ����) ------------

//------------------ Controller (���) ----------------
class MusicPlayer {
// �����ϴ� ��
}
//------------------ End of Controller (���) ----------

public class Ch05MainCls {
public static void main(String[] args) {
   DataAccessModel dam = new DataAccessModel();    // DAO ����
   dam.appendMusic(new DanceMusic("����ȭ", "�佺Ƽ��", "����"));   // VO ����
   dam.appendMusic(new DanceMusic("������", "�ٶ��ǳ뷡", "Ʈ��Ʈ"));
   dam.appendMusic(new NCSMusic("�ƹ�ư �뷡", "��"));
   dam.appendMusic(new NCSMusic("���� �������", "°��"));
   
   Music[] musicList = dam.getAllMuic();
   for(int i=0; i<musicList.length; i++) {
      if(musicList[i] == null) break;
      System.out.print(i + "> ");
      musicList[i].play();
   }
   
   Music m1 = dam.findMusic(null);
}
}