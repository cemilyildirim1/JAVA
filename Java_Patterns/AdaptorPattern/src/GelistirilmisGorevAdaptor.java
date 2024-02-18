public class GelistirilmisGorevAdaptor implements Gorev{
    private GelistirilmisGorev gelistirilmisgorev;

    public GelistirilmisGorevAdaptor(GelistirilmisGorev gelistirilmisGorev){
        this.gelistirilmisgorev=gelistirilmisGorev;
    }

    public String gorevAdi(){
        return gelistirilmisgorev.taskName;
    }
}
