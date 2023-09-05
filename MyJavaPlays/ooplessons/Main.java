public class Main {

public static void main(String[]args) {

Heroes gusion = new Heroes("Gusion","Assasin",4,3500,2500);

System.out.println(gusion.name);
System.out.println(gusion.role);
System.out.println(gusion.numOfSkills);
System.out.println(gusion.hp);
System.out.println(gusion.mana);

gusion.skil1();
gusion.skil2();
gusion.skil3();
gusion.skil4();


Heroes miya = new Heroes("Miya","Marksman",4,2800,2500);
System.out.println(miya.name);
System.out.println(miya.role);
System.out.println(miya.numOfSkills);
System.out.println(miya.hp);
System.out.println(miya.mana);

miya.skil1();
miya.skil2();
miya.skil3();
miya.skil4();




}







}