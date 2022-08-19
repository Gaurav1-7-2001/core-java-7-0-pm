package Collection.HashSet;

import model.Doctor;

import javax.print.Doc;
import java.util.HashSet;

public class DoctorHashSet {

    //todo :     hash set does not print duplicate value
//                      HashSet : it never stores Duplicates
//                      Every Object has HashCode : Unique number
//                      HashSet does not mantain insertion order
//                        set of userDefinedObject

    public  HashSet<Doctor> createHashset(){

        // todo : create object of hashset
        HashSet<Doctor> detail =new HashSet<>();

        // todo :make object of user defined class
        Doctor doc =new Doctor("Dr Ram","eye specialist", 100);
        System.out.println("hashcode of s1:"+doc.hashCode());

        Doctor doc1=new Doctor("Dr Saam","therapist",102);
        System.out.println("hashcode of s1:"+doc1.hashCode());

        Doctor doc2 =new Doctor("Dr EEMi" ,"skin specialist",103);
        System.out.println("hashcode of s2:"+doc2.hashCode());

        Doctor doc3 =new Doctor(" Dr Sen", "Bone specilaist",104);
        System.out.println("hashcode of s3:"+doc3.hashCode());

        Doctor doc4 =new Doctor("Dr Ram","eye specialist", 10);
        System.out.println("hashcode of s4:"+doc4.hashCode());

        Doctor doc5=new Doctor("Dr Saam","therapist",102);
        System.out.println("hashcode of s5:"+doc5.hashCode());

        Doctor doc6 =new Doctor("Dr EEMi" ,"skin specialist",103);
        System.out.println("hashcode of s6:"+doc6.hashCode());

        Doctor doc7 =new Doctor(" Dr Sen", "Bone specilaist",104);
        System.out.println("hashcode of s7:"+doc7.hashCode());

        detail.add(doc);
        detail.add(doc1);
        detail.add(doc2);
        detail.add(doc3);
        detail.add(doc4);
        detail.add(doc5);
        detail.add(doc6);
        detail.add(doc7);
        return detail;
    }

    public static void main(String[] args) {

        DoctorHashSet obj =new DoctorHashSet();

        //call the method
        HashSet<Doctor> details=obj.createHashset();

        //advance loop
        for (Doctor var :details){
            System.out.println("print Detail of data:"+var.getName() +" Department :"+var.getDept() +" id :"+var.getId());
        }

    }
}
