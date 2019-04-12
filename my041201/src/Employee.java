public class Employee {

    private String eid;
    private String name;
    private String job;
    public Employee(){}
    public Employee(String eid,String name,String job){
        this.eid=eid;
        this.name=name;
        this.job=job;

    }
    public void setEid (String eid){
        this.eid=eid;
    }
    public  String getEid(){

        return eid;

    }

    public String getJob() {
        return job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void show (){
        System.out.println("yuangongbianhao :"+name+"zhiwei "+job+" yuangongbianhao  "+eid);

    }

//     第四页





}
