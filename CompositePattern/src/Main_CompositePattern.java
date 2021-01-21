public class Main_CompositePattern {
    public static void main(String[] args) {
        Folder root = new Folder("root")
                , home = new Folder("home")
                , garam = new Folder("garam")
                , music = new Folder("music")
                , picture = new Folder("picture")
                , doc = new Folder("doc")
                , usr = new Folder("usr");
        File track1=new File("track1")
                , track2=new File("track2")
                , pic1=new File("pic1")
                , doc1=new File("doc1")
                , java=new File("java");

        root.addrComponent(home);
            home.addrComponent(garam);
                garam.addrComponent(music);
                    music.addrComponent(track1);
                    music.addrComponent(track2);
                garam.addrComponent(picture);
                    picture.addrComponent(pic1);
                garam.addrComponent(doc);
                    doc.addrComponent(doc1);
        root.addrComponent(usr);
            usr.addrComponent(java);
            show(root);

    }

    private static void show(Component component){
        System.out.println(component.getClass().getName()+"|"+component.getName());
        if(component instanceof Folder){
            for(Component c: ((Folder)component).getChildren()){
                show(c);
            }
        }
    }
}
