public class Boards {
    private int bno;
    private String btitle;
    private String bsay;
    private String buser;

    public Boards(){}

    public Boards(int bno, String btitle, String bsay, String buser){
        this.bno = bno;
        this.btitle = btitle;
        this.bsay = bsay;
        this.buser = buser;
    }
    
    public int getBno(){return bno;}
    public String getBtitle(){return btitle;}
    public String getBsay(){return bsay;}
    public String getBuser(){return buser;}
    
    public void setBno(int bno){this.bno = bno;}
    public void setBtitle(String btitle){this.btitle = btitle;}
    public void setBsay(String bsay){this.bsay = bsay;}
    public void setBuser(String buser){this.buser = buser;}

    public String toString(){   
        return bno + "," + btitle + "," + bsay + "," + buser;
    }


}
