package salon;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double diskonmember;
        System.out.print("Diskon member hari ini (%) : ");
        diskonmember = in.nextDouble();
        double c = 0;
        System.out.println("SALON SERBA ADA");
        System.out.println("===============");
        System.out.println("1.Gunting Rambut");
        System.out.println("2.Beli Alat Kecantikan");
        System.out.print("Inputan : ");
        int a = in.nextInt();
        switch(a){
            case 1:{
                System.out.println("1.Shaagy /Rp 45.000");
                System.out.println("2.Sasak /Rp 50.000");
                System.out.println("3.Ponytail /Rp 70.000");
                System.out.print("Inputan : ");
                int b = in.nextInt();
                switch(b){
                    case 1:{
                        c += 45000;break;
                    }
                    case 2:{
                        c += 50000;break;
                    }
                    case 3:{
                        c += 70000;break;
                    }
                }
                System.out.print("Apakah anda ingin membeli alat kecantikan ?(y/n)");
                String masukin = in.next();
                if(masukin.equalsIgnoreCase("Y")){
                String xx;
                double yy = 0;
                do{
                System.out.println("1.Kutek /Rp 20.000");
                System.out.println("2.Masker /Rp 30.000");
                System.out.println("3.Lipstik /Rp 70.000");
                System.out.print("inputan : ");
                int inputan = in.nextInt();
                switch(inputan){
                    case 1:{
                        yy += 20000;break;
                    }
                    case 2:{
                        yy += 30000;break;
                    }
                    case 3:{
                        yy += 70000;break;
                    }
                }
                System.out.print("Apakah masih ada tambahan ?(y/n) ");
                xx = in.next();
                }while(xx.equalsIgnoreCase("Y"));
                
                double total;
                total = yy+c;
                System.out.println("Total belanja anda : "+total);
                System.out.print("Apakah anda member ?(y/n)");
                String member = in.next();
                if(member.equalsIgnoreCase("Y")){
                    System.out.println("1.Premium");
                    System.out.println("2.Gold");
                    System.out.println("3.Silver");
                    System.out.print("inputan : ");
                    int inputan2 = in.nextInt();
                    switch(inputan2){
                        case 1:{
                            Premium prem =  new Premium();
                            prem.diskonAnggota(total);
                            System.out.println("Anda mendapatkan potongan harga premium sebesar : "+prem.getpotonganharga());
                            prem.diskonmember(total,diskonmember);
                            System.out.println("Anda memndapatkan potongan harga member sebesar : "+prem.getpotonganhargamember());
                            double q = prem.potonganharga;
                            double p = prem.potonganhargamember;
                            System.out.println("Total yang harus dibayar : "+(total-(q+p)));
                            break;
                        }
                        case 2:{
                            Gold gold = new Gold();
                            gold.diskonAnggota(total);
                            System.out.println("Anda mendapatkan potongan harga premium sebesar : "+gold.getpotonganharga());
                            gold.diskonmember(total,diskonmember);
                            System.out.println("Anda memndapatkan potongan harga member sebesar : "+gold.getpotonganhargamember());
                            double m = gold.potonganharga;
                            double n = gold.potonganhargamember;
                            System.out.println("Total yang harus dibayar : "+(total-(m+n)));
                            break;
                        }
                        case 3:{
                            Silver silv = new Silver();
                            silv.diskonAnggota(total);
                            System.out.println("Anda mendapatkan potongan harga premium sebesar : "+silv.getpotonganharga());
                            silv.diskonmember(total,diskonmember);
                            System.out.println("Anda memndapatkan potongan harga member sebesar : "+silv.getpotonganhargamember());
                            double t = silv.potonganharga;
                            double u = silv.potonganhargamember;
                            System.out.println("Total yang harus dibayar : "+(total-(t+u)));
                            break;
                        }
                    }
                }
                else if(member.equalsIgnoreCase("N")){
                    System.out.println("Total yang harus dibayar : "+total);
                }
                }
                else if(masukin.equalsIgnoreCase("N")){
                    break;
                }
                break;
            }
            case 2:{
                String x;
                double y = 0;
                do{
                System.out.println("1.Kutek /Rp 20.000");
                System.out.println("2.Masker /Rp 30.000");
                System.out.println("3.Lipstik /Rp 70.000");
                System.out.println("inputan : ");
                int inputan = in.nextInt();
                switch(inputan){
                    case 1:{
                        y += 20000;break;
                    }
                    case 2:{
                        y += 30000;break;
                    }
                    case 3:{
                        y += 70000;break;
                    }
                }
                System.out.println("Apakah masih ada tambahan ?(y/n) ");
                x = in.next();
                }while(x.equalsIgnoreCase("Y"));
                
                
                System.out.println("Total belanja anda : "+y);
                System.out.println("Apakah anda member ?(y/n)");
                String member = in.next();
                if(member.equalsIgnoreCase("Y")){
                    System.out.println("1.Premium");
                    System.out.println("2.Gold");
                    System.out.println("3.Silver");
                    System.out.println("inputan : ");
                    int inputan2 = in.nextInt();
                    switch(inputan2){
                        case 1:{
                            Premium prem =  new Premium();
                            prem.diskonAnggota(y);
                            System.out.println("Anda mendapatkan potongan harga premium sebesar : "+prem.getpotonganharga());
                            prem.diskonmember(y,diskonmember);
                            System.out.println("Anda memndapatkan potongan harga member sebesar : "+prem.getpotonganhargamember());
                            double q = prem.potonganharga;
                            double p = prem.potonganhargamember;
                            System.out.println("Total yang harus dibayar : "+(y-(q+p)));
                            break;
                        }
                        case 2:{
                            Gold gold = new Gold();
                            gold.diskonAnggota(y);
                            System.out.println("Anda mendapatkan potongan harga premium sebesar : "+gold.getpotonganharga());
                            gold.diskonmember(y,diskonmember);
                            System.out.println("Anda memndapatkan potongan harga member sebesar : "+gold.getpotonganhargamember());
                            double m = gold.potonganharga;
                            double n = gold.potonganhargamember;
                            System.out.println("Total yang harus dibayar : "+(y-(m+n)));
                            break;
                        }
                        case 3:{
                            Silver silv = new Silver();
                            silv.diskonAnggota(y);
                            System.out.println("Anda mendapatkan potongan harga premium sebesar : "+silv.getpotonganharga());
                            silv.diskonmember(y,diskonmember);
                            System.out.println("Anda memndapatkan potongan harga member sebesar : "+silv.getpotonganhargamember());
                            double t = silv.potonganharga;
                            double u = silv.potonganhargamember;
                            System.out.println("Total yang harus dibayar : "+(y-(t+u)));
                            break;
                        }
                    }
                }
                else if(member.equalsIgnoreCase("N")){
                    System.out.println("Total yang harus dibayar : "+y);
                }
                break;
            }
        }
        
    }
}
