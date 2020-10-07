package xie.pojo;

import java.util.Date;

public class Content {
    int id;
    String content; //留言内容
    String name; //留言者
    Date tame; //留言时间

    @Override
    public String toString() {
        return "content{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", name='" + name + '\'' +
                ", tame=" + tame +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTame() {
        return tame;
    }

    public void setTame(Date tame) {
        this.tame = tame;
    }

    public Content() {
    }

    public Content(int id, String content, String name, Date tame) {
        this.id = id;
        this.content = content;
        this.name = name;
        this.tame = tame;
    }




}
