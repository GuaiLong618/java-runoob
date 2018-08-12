package five;

public class Song {
    private String singer;
    private String name;

    public Song() {
    }

    public Song(String singer, String name) {
        this.singer = singer;
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
