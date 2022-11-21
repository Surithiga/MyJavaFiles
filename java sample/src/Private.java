public class Private {
    public static void main(String[] args) {
        Manager obj=new Manager();
        obj.setname("udhaya");
        System.out.println(obj.getname());
        obj.setaddress("ond");
        System.out.println(obj.getAddress());

    }
}
class Manager{
    private String name;
    private String address;

    public String getname(){
        return name;

    }
    public void setname(String name){
        this.name=name;
    }


    public String getAddress() {
        return address;
    }
    public void setaddress(String address){
        this.address=address;
    }
}
