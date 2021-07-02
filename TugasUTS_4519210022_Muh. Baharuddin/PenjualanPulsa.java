import java.util.*;
public class PenjualanPulsa {
//Npm     : 4519210022
//Nama    : Muh.Baharuddin
//Program : Tugas Besar UTS
//Update  : 12 April 2021

private int SisaPulsa, Harga1, Harga2, Harga3, Harga4, Gopay, Ovo, Dana, ShopeePay;
private double SisaKouta, kouta1, kouta2, kouta3, kouta4;

//setter sisa pulsa
public void set_sisa_pulsa(int SisaPulsa){
    this.SisaPulsa = SisaPulsa;
}

//getter sisa pulsa
public int get_sisa_pulsa(){
    return this.SisaPulsa;
}

//setter harga pulsa 1
public void set_harga1(int Harga1){
    this.Harga1 = Harga1;
}

//getter harga pulsa 1
public int get_harga1(){
    return this.Harga1;
}

//setter harga pulsa 2
public void set_harga2(int Harga2){
    this.Harga2 = Harga2;
}

//getter harga pulsa 2
public int get_harga2(){
    return this.Harga2;
}

//setter harga pulsa 3
public void set_harga3(int Harga3){
    this.Harga3 = Harga3;
}

//getter harga pulsa 3
public int get_harga3(){
    return this.Harga3;
}

//setter harga pulsa 4
public void set_harga4(int Harga4){
    this.Harga4 = Harga4;
}

//getter harga pulsa 4
public int get_harga4(){
    return this.Harga4;
}

//setter sisa kouta
public void set_sisa_kouta(double SisaKouta){
    this.SisaKouta = SisaKouta;
}

//getter sisa kouta
public double get_sisa_kouta(){
    return this.SisaKouta;
}

//setter kouta1
public void set_kouta1(double kouta1){
    this.kouta1 = kouta1;
}

//getter kouta1
public double get_kouta1(){
    return this.kouta1;
}

//setter kouta2
public void set_kouta2(double kouta2){
    this.kouta2 = kouta2;
}

//getter kouta2
public double get_kouta2(){
    return this.kouta2;
}

//setter kouta3
public void set_kouta3(double kouta3){
    this.kouta3 = kouta3;
}

//getter kouta3
public double get_kouta3(){
    return this.kouta3;
}

//setter kouta4
public void set_kouta4(double kouta4){
    this.kouta4 = kouta4;
}

//getter kouta4
public double get_kouta4(){
    return this.kouta4;
}

//setter saldo Gopay
public void set_saldo_Gopay(int Gopay){
    this.Gopay = Gopay;
}

//getter saldo Gopay
public int get_saldo_Gopay(){
    return this.Gopay;
}

//setter saldo Ovo
public void set_saldo_Ovo(int Ovo){
    this.Ovo = Ovo;
}

//getter saldo Ovo
public int get_saldo_Ovo(){
    return this.Ovo;
}

//setter saldo Dana
public void set_saldo_Dana(int Dana){
    this.Dana = Dana;
}

//getter saldo Dana
public int get_saldo_Dana(){
    return this.Dana;
}

//setter saldo ShopeePay
public void set_saldo_ShopeePay(int ShopeePay){
    this.ShopeePay = ShopeePay;
}

//getter saldo ShopeePay
public int get_saldo_ShopeePay(){
    return this.ShopeePay;
}

//Pin
public static void pass(int password)   {
    Scanner input_data_bahar = new Scanner(System.in);
    System.out.print("Masukkan Pin Anda : ");
    password = input_data_bahar.nextInt();
    System.out.print("Masukkan Kembali Pin : ");
    int password1 = input_data_bahar.nextInt();
    //cek kesamaan password
    if(password == password1){
        System.out.println("");
        System.out.println("Selamat pendaftaran anda telah selesai");
    }else{
        System.out.println("Pin yang anda masukkan tidak sama, silahkan masukkan kembali");
        while (password != password1) {
            System.out.print("Masukkan Pin Anda : ");
            password = input_data_bahar.nextInt();
            System.out.print("Masukkan Kembali Pin : ");
            password1 = input_data_bahar.nextInt();
            if(password == password1){
                System.out.println("");
                System.out.println("Selamat pendaftaran anda telah selesai");
            }else{
                System.out.println("Pin yang anda masukkan tidak sama, silahkan masukkan kembali");
            }
        }
    }
}

//Nomor
public static void input_nomor()    {
    Scanner input_data_bahar = new Scanner(System.in);
    System.out.print("Masukkan nomor anda : ");
    String nomor = input_data_bahar.nextLine();

    while ((nomor.length() > 12) || (nomor.length() < 10)) {
        System.out.println("Error: Input untuk nomor tidak sesuai, harus berdigit 11-12");
    
        System.out.print("Masukkan nomor anda : ");
        nomor = input_data_bahar.nextLine();
    }
}


public static void main(String []args) {
    //membusat objek
    PenjualanPulsa pulsa = new PenjualanPulsa();
    PenjualanPulsa data = new PenjualanPulsa();
    PenjualanPulsa saldo = new PenjualanPulsa();

    Scanner input_data_bahar = new Scanner(System.in);
    int password = 0, pilih = 3, jmlhpulsa = 0;
    int pilihan, pilih1, pilih2;;
    double koutaData = 0.0;
    String Username;
    char pilihan1 ='y';
    System.out.println("NPM : 4519210022");
    System.out.println("Nama : Muh.Baharuddin");
    System.out.println("Program : Tugas Besar UTS");
    System.out.println();
    System.out.println("Hallo User, Selamat datang diprogram Kartu.Go");
    System.out.println("Silahkan daftarkan diri anda terlebih dahulu");
    System.out.println("");
    System.out.print("Masukkan Username Anda : ");
    Username = input_data_bahar.nextLine();  
    input_nomor();
    pass(password);
    System.out.println("");
    System.out.println("Hallo " + Username + ", berikut ini adalah daftar menu program Kartu.Go");
    mulai:
    do  {  
        System.out.println("");
        System.out.println("1. Cek Pulsa");
        System.out.println("2. Isi Pulsa");
        System.out.println("3. Cek Kouta Internet");
        System.out.println("4. Isi Kouta Internet");
        System.out.println("5. Keluar");
        System.out.print("Silahkan masukkan pilihan anda  :");
        pilih = input_data_bahar.nextInt();
        switch(pilih)
        {
            case 1:
                pulsa.set_sisa_pulsa(5000 +  jmlhpulsa);
                System.out.println("Sisa pulsa yang anda miliki senilai " + pulsa.get_sisa_pulsa());
                while(pilihan1 != 'Y' || pilihan1 != 'N'){
                    System.out.println("Apakah anda ingin kembali ke menu sebelumnya?");
                    System.out.print("Silahkan tekan [Y]kembali atau [N]berhenti : ");
                    pilihan1 = input_data_bahar.next().charAt(0);
                    if (pilihan1 == 'Y'){
                        continue mulai;
                    } else if (pilihan1 == 'N'){
                        System.exit(0);
                    } else {
                        System.out.println("Pilihan yang anda masukkan salah");
                    }
                }   
                break;
            case 2:
                pulsa.set_harga1(5000);
                pulsa.set_harga2(10000);
                pulsa.set_harga3(50000);
                pulsa.set_harga4(100000);
                System.out.println("");
                System.out.println("1. pulsa " + pulsa.get_harga1() + " Seharga Rp " + pulsa.get_harga1());
                System.out.println("2. pulsa " + pulsa.get_harga2() + " Seharga Rp " + pulsa.get_harga2());
                System.out.println("3. pulsa " + pulsa.get_harga3() + " Seharga Rp " + pulsa.get_harga3());
                System.out.println("4. pulsa " + pulsa.get_harga4() + " Seharga Rp " + pulsa.get_harga4());
                System.out.print("Silahkan pilih pengisian pulsa yang anda inginkan : ");
                pilih1 = input_data_bahar.nextInt();
                System.out.println("");
                if(pilih1 == 1)    {
                    System.out.println("Pilih menu pembayaran :");
                    System.out.println("1. Gopay");
                    System.out.println("2. Ovo");
                    System.out.println("3. Dana");
                    System.out.println("4. ShopeePay");
                    System.out.print("Masukkan pilihan anda : ");
                    pilih2 = input_data_bahar.nextInt();
                    switch(pilih2){
                    case 1 :
                        saldo.set_saldo_Gopay(38000);
                        System.out.println("Anda memiliki saldo Gopay senilai : " + saldo.get_saldo_Gopay());
                        System.out.println("Anda akan melakukan pembayaran sebesar : " + pulsa.get_harga1());
                        while(pilihan1 != 'Y' || pilihan1 != 'N'){
                            System.out.println("Apakah anda ingin melanjutkan pembelian ?");
                            System.out.print("Silahkan tekan [Y]Yes atau [N]No : ");
                            pilihan1 = input_data_bahar.next().charAt(0);
                            if (pilihan1 == 'Y' && saldo.get_saldo_Gopay() >= pulsa.get_harga1()){
                                jmlhpulsa += pulsa.get_harga1();
                                continue mulai;
                            }else if(pilihan1 == 'Y' && saldo.get_saldo_Gopay() < pulsa.get_harga1()){
                                System.out.print("Saldo anda tidak mencukupi untuk melakukan pembelian");
                                continue mulai;
                            } else if (pilihan1 == 'N'){
                                continue mulai;
                            } else {
                                System.out.println("Pilihan yang anda masukkan salah");
                            }
                        }
                        break;
                    case 2 :
                        saldo.set_saldo_Ovo(100000);
                        System.out.println("Anda memiliki saldo Ovo senilai : " + saldo.get_saldo_Ovo());
                        System.out.println("Anda akan melakukan pembayaran sebesar : " + pulsa.get_harga1());
                        while(pilihan1 != 'Y' || pilihan1 != 'N'){
                            System.out.println("Apakah anda ingin melanjutkan pembelian ?");
                            System.out.print("Silahkan tekan [Y]Yes atau [N]No : ");
                            pilihan1 = input_data_bahar.next().charAt(0);
                            if (pilihan1 == 'Y' && saldo.get_saldo_Ovo() >= pulsa.get_harga1()){
                                jmlhpulsa += pulsa.get_harga1();
                                continue mulai;
                            }else if(pilihan1 == 'Y' && saldo.get_saldo_Ovo() < pulsa.get_harga1()){
                                System.out.print("Saldo anda tidak mencukupi untuk melakukan pembelian");
                                continue mulai;
                            } else if (pilihan1 == 'N'){
                                continue mulai;
                            } else {
                                System.out.println("Pilihan yang anda masukkan salah");
                            }
                        }
                        break;
                    case 3 :
                        saldo.set_saldo_Dana(120000);
                        System.out.println("Anda memiliki saldo Dana senilai : " + saldo.get_saldo_Dana());
                        System.out.println("Anda akan melakukan pembayaran sebesar : " + pulsa.get_harga1());
                        while(pilihan1 != 'Y' || pilihan1 != 'N'){
                            System.out.println("Apakah anda ingin melanjutkan pembelian ?");
                            System.out.print("Silahkan tekan [Y]Yes atau [N]No : ");
                            pilihan1 = input_data_bahar.next().charAt(0);
                            if (pilihan1 == 'Y' && saldo.get_saldo_Dana() >= pulsa.get_harga1()){
                                jmlhpulsa += pulsa.get_harga1();
                                continue mulai;
                            }else if(pilihan1 == 'Y' && saldo.get_saldo_Dana() < pulsa.get_harga1()){
                                System.out.print("Saldo anda tidak mencukupi untuk melakukan pembelian");
                                continue mulai;
                            } else if (pilihan1 == 'N'){
                                continue mulai;
                            } else {
                                System.out.println("Pilihan yang anda masukkan salah");
                            }
                        }
                        break;
                    case 4 :
                        saldo.set_saldo_ShopeePay(57000);
                        System.out.println("Anda memiliki saldo ShopeePay senilai : " + saldo.get_saldo_ShopeePay());
                        System.out.println("Anda akan melakukan pembayaran sebesar : " + pulsa.get_harga1());
                        while(pilihan1 != 'Y' || pilihan1 != 'N'){
                            System.out.println("Apakah anda ingin melanjutkan pembelian ?");
                            System.out.print("Silahkan tekan [Y]Yes atau [N]No : ");
                            pilihan1 = input_data_bahar.next().charAt(0);
                            if (pilihan1 == 'Y' && saldo.get_saldo_ShopeePay() >= pulsa.get_harga1()){
                                jmlhpulsa += pulsa.get_harga1();
                                continue mulai;
                            }else if(pilihan1 == 'Y' && saldo.get_saldo_ShopeePay() < pulsa.get_harga1()){
                                System.out.print("Saldo anda tidak mencukupi untuk melakukan pembelian");
                                continue mulai;
                            } else if (pilihan1 == 'N'){
                                continue mulai;
                            } else {
                                System.out.println("Pilihan yang anda masukkan salah");
                            }
                        }
                        break;
                    default :
                        System.out.println("Maaf input yang anda masukkan salah");
                        while(pilihan1 != 'Y' || pilihan1 != 'N'){
                            System.out.println("Apakah anda ingin kembali ke menu sebelumnya?");
                            System.out.print("Silahkan tekan [Y]kembali atau [N]berhenti : ");
                            pilihan1 = input_data_bahar.next().charAt(0);
                            if (pilihan1 == 'Y'){
                                continue mulai;
                            } else if (pilihan1 == 'N'){
                                System.exit(0);
                            } else {
                                System.out.println("Pilihan yang anda masukkan salah");
                            } 
                        } 
                        break;            
                    }
                }else if(pilih1 == 2){
                    System.out.println("Pilih menu pembayaran :");
                    System.out.println("1. Gopay");
                    System.out.println("2. Ovo");
                    System.out.println("3. Dana");
                    System.out.println("4. ShopeePay");
                    System.out.print("Masukkan pilihan anda : ");
                    pilih2 = input_data_bahar.nextInt();
                    switch(pilih2){
                    case 1 :
                        saldo.set_saldo_Gopay(38000);
                        System.out.println("Anda memiliki saldo Gopay senilai : " + saldo.get_saldo_Gopay());
                        System.out.println("Anda akan melakukan pembayaran sebesar : " + pulsa.get_harga2());
                        while(pilihan1 != 'Y' || pilihan1 != 'N'){
                            System.out.println("Apakah anda ingin melanjutkan pembelian ?");
                            System.out.print("Silahkan tekan [Y]Yes atau [N]No : ");
                            pilihan1 = input_data_bahar.next().charAt(0);
                            if (pilihan1 == 'Y' && saldo.get_saldo_Gopay() >= pulsa.get_harga2()){
                                jmlhpulsa += pulsa.get_harga2();
                                continue mulai;
                            }else if(pilihan1 == 'Y' && saldo.get_saldo_Gopay() < pulsa.get_harga2()){
                                System.out.print("Saldo anda tidak mencukupi untuk melakukan pembelian");
                                continue mulai;
                            } else if (pilihan1 == 'N'){
                                continue mulai;
                            } else {
                                System.out.println("Pilihan yang anda masukkan salah");
                            }
                        }
                        break;
                    case 2 :
                        saldo.set_saldo_Ovo(100000);
                        System.out.println("Anda memiliki saldo Ovo senilai : " + saldo.get_saldo_Ovo());
                        System.out.println("Anda akan melakukan pembayaran sebesar : " + pulsa.get_harga2());
                        while(pilihan1 != 'Y' || pilihan1 != 'N'){
                            System.out.println("Apakah anda ingin melanjutkan pembelian ?");
                            System.out.print("Silahkan tekan [Y]Yes atau [N]No : ");
                            pilihan1 = input_data_bahar.next().charAt(0);
                            if (pilihan1 == 'Y' && saldo.get_saldo_Ovo() >= pulsa.get_harga2()){
                                jmlhpulsa += pulsa.get_harga2();
                                continue mulai;
                            }else if(pilihan1 == 'Y' && saldo.get_saldo_Ovo() < pulsa.get_harga2()){
                                System.out.print("Saldo anda tidak mencukupi untuk melakukan pembelian");
                                continue mulai;
                            } else if (pilihan1 == 'N'){
                                continue mulai;
                            } else {
                                System.out.println("Pilihan yang anda masukkan salah");
                            }
                        }
                        break;
                    case 3 :
                        saldo.set_saldo_Dana(120000);
                        System.out.println("Anda memiliki saldo Dana senilai : " + saldo.get_saldo_Dana());
                        System.out.println("Anda akan melakukan pembayaran sebesar : " + pulsa.get_harga2());
                        while(pilihan1 != 'Y' || pilihan1 != 'N'){
                            System.out.println("Apakah anda ingin melanjutkan pembelian ?");
                            System.out.print("Silahkan tekan [Y]Yes atau [N]No : ");
                            pilihan1 = input_data_bahar.next().charAt(0);
                            if (pilihan1 == 'Y' && saldo.get_saldo_Dana() >= pulsa.get_harga2()){
                                jmlhpulsa += pulsa.get_harga2();
                                continue mulai;
                            }else if(pilihan1 == 'Y' && saldo.get_saldo_Dana() < pulsa.get_harga2()){
                                System.out.print("Saldo anda tidak mencukupi untuk melakukan pembelian");
                                continue mulai;
                            } else if (pilihan1 == 'N'){
                                continue mulai;
                            } else {
                                System.out.println("Pilihan yang anda masukkan salah");
                            }
                        }
                        break;
                    case 4 :
                        saldo.set_saldo_ShopeePay(57000);
                        System.out.println("Anda memiliki saldo ShopeePay senilai : " + saldo.get_saldo_ShopeePay());
                        System.out.println("Anda akan melakukan pembayaran sebesar : " + pulsa.get_harga2());
                        while(pilihan1 != 'Y' || pilihan1 != 'N'){
                            System.out.println("Apakah anda ingin melanjutkan pembelian ?");
                            System.out.print("Silahkan tekan [Y]Yes atau [N]No : ");
                            pilihan1 = input_data_bahar.next().charAt(0);
                            if (pilihan1 == 'Y' && saldo.get_saldo_ShopeePay() >= pulsa.get_harga2()){
                                jmlhpulsa += pulsa.get_harga2();
                                continue mulai;
                            }else if(pilihan1 == 'Y' && saldo.get_saldo_ShopeePay() < pulsa.get_harga2()){
                                System.out.print("Saldo anda tidak mencukupi untuk melakukan pembelian");
                                continue mulai;
                            } else if (pilihan1 == 'N'){
                                continue mulai;
                            } else {
                                System.out.println("Pilihan yang anda masukkan salah");
                            }
                        }
                        break;
                    default :
                        System.out.println("Maaf input yang anda masukkan salah");
                        while(pilihan1 != 'Y' || pilihan1 != 'N'){
                            System.out.println("Apakah anda ingin kembali ke menu sebelumnya?");
                            System.out.print("Silahkan tekan [Y]kembali atau [N]berhenti : ");
                            pilihan1 = input_data_bahar.next().charAt(0);
                            if (pilihan1 == 'Y'){
                                continue mulai;
                            } else if (pilihan1 == 'N'){
                                System.exit(0);
                            } else {
                                System.out.println("Pilihan yang anda masukkan salah");
                            } 
                        } 
                        break;            
                    }
                }else if(pilih1 == 3){
                    System.out.println("Pilih menu pembayaran :");
                    System.out.println("1. Gopay");
                    System.out.println("2. Ovo");
                    System.out.println("3. Dana");
                    System.out.println("4. ShopeePay");
                    System.out.print("Masukkan pilihan anda : ");
                    pilih2 = input_data_bahar.nextInt();
                    switch(pilih2){
                    case 1 :
                        saldo.set_saldo_Gopay(38000);
                        System.out.println("Anda memiliki saldo Gopay senilai : " + saldo.get_saldo_Gopay());
                        System.out.println("Anda akan melakukan pembayaran sebesar : " + pulsa.get_harga3());
                        while(pilihan1 != 'Y' || pilihan1 != 'N'){
                            System.out.println("Apakah anda ingin melanjutkan pembelian ?");
                            System.out.print("Silahkan tekan [Y]Yes atau [N]No : ");
                            pilihan1 = input_data_bahar.next().charAt(0);
                            if (pilihan1 == 'Y' && saldo.get_saldo_Gopay() >= pulsa.get_harga3()){
                                jmlhpulsa += pulsa.get_harga3();
                                continue mulai;
                            }else if(pilihan1 == 'Y' && saldo.get_saldo_Gopay() < pulsa.get_harga3()){
                                System.out.print("Saldo anda tidak mencukupi untuk melakukan pembelian");
                                continue mulai;
                            } else if (pilihan1 == 'N'){
                                continue mulai;
                            } else {
                                System.out.println("Pilihan yang anda masukkan salah");
                            }
                        }
                        break;
                    case 2 :
                        saldo.set_saldo_Ovo(100000);
                        System.out.println("Anda memiliki saldo Ovo senilai : " + saldo.get_saldo_Ovo());
                        System.out.println("Anda akan melakukan pembayaran sebesar : " + pulsa.get_harga3());
                        while(pilihan1 != 'Y' || pilihan1 != 'N'){
                            System.out.println("Apakah anda ingin melanjutkan pembelian ?");
                            System.out.print("Silahkan tekan [Y]Yes atau [N]No : ");
                            pilihan1 = input_data_bahar.next().charAt(0);
                            if (pilihan1 == 'Y' && saldo.get_saldo_Ovo() >= pulsa.get_harga3()){
                                jmlhpulsa += pulsa.get_harga3();
                                continue mulai;
                            }else if(pilihan1 == 'Y' && saldo.get_saldo_Ovo() < pulsa.get_harga3()){
                                System.out.print("Saldo anda tidak mencukupi untuk melakukan pembelian");
                                continue mulai;
                            } else if (pilihan1 == 'N'){
                                continue mulai;
                            } else {
                                System.out.println("Pilihan yang anda masukkan salah");
                            }
                        }
                        break;
                    case 3 :
                        saldo.set_saldo_Dana(120000);
                        System.out.println("Anda memiliki saldo Dana senilai : " + saldo.get_saldo_Dana());
                        System.out.println("Anda akan melakukan pembayaran sebesar : " + pulsa.get_harga3());
                        while(pilihan1 != 'Y' || pilihan1 != 'N'){
                            System.out.println("Apakah anda ingin melanjutkan pembelian ?");
                            System.out.print("Silahkan tekan [Y]Yes atau [N]No : ");
                            pilihan1 = input_data_bahar.next().charAt(0);
                            if (pilihan1 == 'Y' && saldo.get_saldo_Dana() >= pulsa.get_harga3()){
                                jmlhpulsa += pulsa.get_harga3();
                                continue mulai;
                            }else if(pilihan1 == 'Y' && saldo.get_saldo_Dana() < pulsa.get_harga3()){
                                System.out.print("Saldo anda tidak mencukupi untuk melakukan pembelian");
                                continue mulai;
                            } else if (pilihan1 == 'N'){
                                continue mulai;
                            } else {
                                System.out.println("Pilihan yang anda masukkan salah");
                            }
                        }
                        break;
                    case 4 :
                        saldo.set_saldo_ShopeePay(57000);
                        System.out.println("Anda memiliki saldo ShopeePay senilai : " + saldo.get_saldo_ShopeePay());
                        System.out.println("Anda akan melakukan pembayaran sebesar : " + pulsa.get_harga3());
                        while(pilihan1 != 'Y' || pilihan1 != 'N'){
                            System.out.println("Apakah anda ingin melanjutkan pembelian ?");
                            System.out.print("Silahkan tekan [Y]Yes atau [N]No : ");
                            pilihan1 = input_data_bahar.next().charAt(0);
                            if (pilihan1 == 'Y' && saldo.get_saldo_ShopeePay() >= pulsa.get_harga3()){
                                jmlhpulsa += pulsa.get_harga3();
                                continue mulai;
                            }else if(pilihan1 == 'Y' && saldo.get_saldo_ShopeePay() < pulsa.get_harga3()){
                                System.out.print("Saldo anda tidak mencukupi untuk melakukan pembelian");
                                continue mulai;
                            } else if (pilihan1 == 'N'){
                                continue mulai;
                            } else {
                                System.out.println("Pilihan yang anda masukkan salah");
                            }
                        }
                        break;
                    default :
                        System.out.println("Maaf input yang anda masukkan salah");
                        while(pilihan1 != 'Y' || pilihan1 != 'N'){
                            System.out.println("Apakah anda ingin kembali ke menu sebelumnya?");
                            System.out.print("Silahkan tekan [Y]kembali atau [N]berhenti : ");
                            pilihan1 = input_data_bahar.next().charAt(0);
                            if (pilihan1 == 'Y'){
                                continue mulai;
                            } else if (pilihan1 == 'N'){
                                System.exit(0);
                            } else {
                                System.out.println("Pilihan yang anda masukkan salah");
                            } 
                        } 
                        break;            
                    }
                }else if(pilih1 == 4){
                    System.out.println("Pilih menu pembayaran :");
                    System.out.println("1. Gopay");
                    System.out.println("2. Ovo");
                    System.out.println("3. Dana");
                    System.out.println("4. ShopeePay");
                    System.out.print("Masukkan pilihan anda : ");
                    pilih2 = input_data_bahar.nextInt();
                    switch(pilih2){
                    case 1 :
                        saldo.set_saldo_Gopay(38000);
                        System.out.println("Anda memiliki saldo Gopay senilai : " + saldo.get_saldo_Gopay());
                        System.out.println("Anda akan melakukan pembayaran sebesar : " + pulsa.get_harga4());
                        while(pilihan1 != 'Y' || pilihan1 != 'N'){
                            System.out.println("Apakah anda ingin melanjutkan pembelian ?");
                            System.out.print("Silahkan tekan [Y]Yes atau [N]No : ");
                            pilihan1 = input_data_bahar.next().charAt(0);
                            if (pilihan1 == 'Y' && saldo.get_saldo_Gopay() >= pulsa.get_harga4()){
                                jmlhpulsa += pulsa.get_harga4();
                                continue mulai;
                            }else if(pilihan1 == 'Y' && saldo.get_saldo_Gopay() < pulsa.get_harga4()){
                                System.out.print("Saldo anda tidak mencukupi untuk melakukan pembelian");
                                continue mulai;
                            } else if (pilihan1 == 'N'){
                                continue mulai;
                            } else {
                                System.out.println("Pilihan yang anda masukkan salah");
                            }
                        }
                        break;
                    case 2 :
                        saldo.set_saldo_Ovo(100000);
                        System.out.println("Anda memiliki saldo Ovo senilai : " + saldo.get_saldo_Ovo());
                        System.out.println("Anda akan melakukan pembayaran sebesar : " + pulsa.get_harga4());
                        while(pilihan1 != 'Y' || pilihan1 != 'N'){
                            System.out.println("Apakah anda ingin melanjutkan pembelian ?");
                            System.out.print("Silahkan tekan [Y]Yes atau [N]No : ");
                            pilihan1 = input_data_bahar.next().charAt(0);
                            if (pilihan1 == 'Y' && saldo.get_saldo_Ovo() >= pulsa.get_harga4()){
                                jmlhpulsa += pulsa.get_harga4();
                                continue mulai;
                            }else if(pilihan1 == 'Y' && saldo.get_saldo_Ovo() < pulsa.get_harga4()){
                                System.out.print("Saldo anda tidak mencukupi untuk melakukan pembelian");
                                continue mulai;
                            } else if (pilihan1 == 'N'){
                                continue mulai;
                            } else {
                                System.out.println("Pilihan yang anda masukkan salah");
                            }
                        }
                        break;
                    case 3 :
                        saldo.set_saldo_Dana(120000);
                        System.out.println("Anda memiliki saldo Dana senilai : " + saldo.get_saldo_Dana());
                        System.out.println("Anda akan melakukan pembayaran sebesar : " + pulsa.get_harga4());
                        while(pilihan1 != 'Y' || pilihan1 != 'N'){
                            System.out.println("Apakah anda ingin melanjutkan pembelian ?");
                            System.out.print("Silahkan tekan [Y]Yes atau [N]No : ");
                            pilihan1 = input_data_bahar.next().charAt(0);
                            if (pilihan1 == 'Y' && saldo.get_saldo_Dana() >= pulsa.get_harga4()){
                                jmlhpulsa += pulsa.get_harga4();
                                continue mulai;
                            }else if(pilihan1 == 'Y' && saldo.get_saldo_Dana() < pulsa.get_harga4()){
                                System.out.print("Saldo anda tidak mencukupi untuk melakukan pembelian");
                                continue mulai;
                            } else if (pilihan1 == 'N'){
                                continue mulai;
                            } else {
                                System.out.println("Pilihan yang anda masukkan salah");
                            }
                        }
                        break;
                    case 4 :
                        saldo.set_saldo_ShopeePay(57000);
                        System.out.println("Anda memiliki saldo ShopeePay senilai : " + saldo.get_saldo_ShopeePay());
                        System.out.println("Anda akan melakukan pembayaran sebesar : " + pulsa.get_harga4());
                        while(pilihan1 != 'Y' || pilihan1 != 'N'){
                            System.out.println("Apakah anda ingin melanjutkan pembelian ?");
                            System.out.print("Silahkan tekan [Y]Yes atau [N]No : ");
                            pilihan1 = input_data_bahar.next().charAt(0);
                            if (pilihan1 == 'Y' && saldo.get_saldo_ShopeePay() >= pulsa.get_harga4()){
                                jmlhpulsa += pulsa.get_harga4();
                                continue mulai;
                            }else if(pilihan1 == 'Y' && saldo.get_saldo_ShopeePay() < pulsa.get_harga4()){
                                System.out.print("Saldo anda tidak mencukupi untuk melakukan pembelian");
                                continue mulai;
                            } else if (pilihan1 == 'N'){
                                continue mulai;
                            } else {
                                System.out.println("Pilihan yang anda masukkan salah");
                            }
                        }
                        break;
                    default :
                        System.out.println("Maaf input yang anda masukkan salah");
                        while(pilihan1 != 'Y' || pilihan1 != 'N'){
                            System.out.println("Apakah anda ingin kembali ke menu sebelumnya?");
                            System.out.print("Silahkan tekan [Y]kembali atau [N]berhenti : ");
                            pilihan1 = input_data_bahar.next().charAt(0);
                            if (pilihan1 == 'Y'){
                                continue mulai;
                            } else if (pilihan1 == 'N'){
                                System.exit(0);
                            } else {
                                System.out.println("Pilihan yang anda masukkan salah");
                            } 
                        } 
                        break;            
                    }
                }else{
                    System.out.println("Maaf input yang anda masukkan salah");
                    while(pilihan1 != 'Y' || pilihan1 != 'N'){
                        System.out.println("Apakah anda ingin kembali ke menu sebelumnya?");
                        System.out.print("Silahkan tekan [Y]kembali atau [N]berhenti : ");
                        pilihan1 = input_data_bahar.next().charAt(0);
                        if (pilihan1 == 'Y'){
                            continue mulai;
                        } else if (pilihan1 == 'N'){
                            System.exit(0);
                        } else {
                            System.out.println("Pilihan yang anda masukkan salah");
                        }
                    }   
                    break;
                }
            case 3:
                data.set_sisa_kouta(2.68 + koutaData);
                System.out.println("Sisa kouta internet yang anda miliki sebesar " + data.get_sisa_kouta() +" GB");
                System.out.println("");
                while(pilihan1 != 'Y' || pilihan1 != 'N'){
                    System.out.println("Apakah anda ingin kembali ke menu sebelumnya?");
                    System.out.print("Silahkan tekan [Y]kembali atau [N]berhenti : ");
                    pilihan1 = input_data_bahar.next().charAt(0);
                    if (pilihan1 == 'Y'){
                        continue mulai;
                    } else if (pilihan1 == 'N'){
                        System.exit(0);
                    } else {
                        System.out.println("Pilihan yang anda masukkan salah");
                    }
                }   
                break;
            case 4 :
                //set kouta
                data.set_kouta1(2);
                data.set_kouta2(5);
                data.set_kouta3(10);
                data.set_kouta4(50);
                //set harga
                data.set_harga1(5000);
                data.set_harga2(10000);
                data.set_harga3(17000);
                data.set_harga4(40000);
                System.out.println("");
                System.out.println("1. Paket Santuy " + data.get_kouta1() + " Gb Seharga Rp " + data.get_harga1());
                System.out.println("2. Paket Kimochi " + data.get_kouta2() + " Gb Seharga Rp " + data.get_harga2());
                System.out.println("3. Paket Marathon " + data.get_kouta3() + " Gb Seharga Rp " + data.get_harga3());
                System.out.println("4. Paket Nolep " + data.get_kouta4() + " Gb Seharga Rp " + data.get_harga4());
                System.out.print("Silahkan pilih paket internet yang anda inginkan : ");
                pilih1 = input_data_bahar.nextInt();
                System.out.println("");
                if(pilih1 == 1 && jmlhpulsa >= data.get_harga1())    {
                    jmlhpulsa -= pulsa.get_harga1();
                    koutaData += data.get_kouta1(); 
                    System.out.println("Selamat anda sukses melakukan pengisian kouta");
                    while(pilihan1 != 'Y' || pilihan1 != 'N'){
                        System.out.println("Apakah anda ingin kembali ke menu sebelumnya?");
                        System.out.print("Silahkan tekan [Y]kembali atau [N]berhenti : ");
                        pilihan1 = input_data_bahar.next().charAt(0);
                        if (pilihan1 == 'Y'){
                            continue mulai;
                        } else if (pilihan1 == 'N'){
                            System.exit(0);
                        } else {
                            System.out.println("Pilihan yang anda masukkan salah");
                        }
                    }
                    break;   
                }else if(pilih1 == 1 && jmlhpulsa < data.get_harga1())    {
                    System.out.println("Maaf pulsa anda tidak mencukupi untuk melakukan pengisian ini");
                    while(pilihan1 != 'Y' || pilihan1 != 'N'){
                        System.out.println("Apakah anda ingin kembali ke menu sebelumnya?");
                        System.out.print("Silahkan tekan [Y]kembali atau [N]berhenti : ");
                        pilihan1 = input_data_bahar.next().charAt(0);
                        if (pilihan1 == 'Y'){
                            continue mulai;
                        } else if (pilihan1 == 'N'){
                            System.exit(0);
                        } else {
                            System.out.println("Pilihan yang anda masukkan salah");
                        }
                    }
                    break;   
                }else if(pilih1 == 2 && jmlhpulsa >= data.get_harga2())    {
                    jmlhpulsa -= pulsa.get_harga2();
                    koutaData += data.get_kouta2(); 
                    System.out.println("Selamat anda sukses melakukan pengisian kouta");
                    while(pilihan1 != 'Y' || pilihan1 != 'N'){
                        System.out.println("Apakah anda ingin kembali ke menu sebelumnya?");
                        System.out.print("Silahkan tekan [Y]kembali atau [N]berhenti : ");
                        pilihan1 = input_data_bahar.next().charAt(0);
                        if (pilihan1 == 'Y'){
                            continue mulai;
                        } else if (pilihan1 == 'N'){
                            System.exit(0);
                        } else {
                            System.out.println("Pilihan yang anda masukkan salah");
                        }
                    }
                    break;   
                }else if(pilih1 == 2 && jmlhpulsa < data.get_harga2())    {
                    System.out.println("Maaf pulsa anda tidak mencukupi untuk melakukan pengisian ini");
                    while(pilihan1 != 'Y' || pilihan1 != 'N'){
                        System.out.println("Apakah anda ingin kembali ke menu sebelumnya?");
                        System.out.print("Silahkan tekan [Y]kembali atau [N]berhenti : ");
                        pilihan1 = input_data_bahar.next().charAt(0);
                        if (pilihan1 == 'Y'){
                            continue mulai;
                        } else if (pilihan1 == 'N'){
                            System.exit(0);
                        } else {
                            System.out.println("Pilihan yang anda masukkan salah");
                        }
                    }
                    break; 
                }if(pilih1 == 3 && jmlhpulsa >= data.get_harga3())    {
                    jmlhpulsa -= pulsa.get_harga3();
                    koutaData += data.get_kouta3(); 
                    System.out.println("Selamat anda sukses melakukan pengisian kouta");
                    while(pilihan1 != 'Y' || pilihan1 != 'N'){
                        System.out.println("Apakah anda ingin kembali ke menu sebelumnya?");
                        System.out.print("Silahkan tekan [Y]kembali atau [N]berhenti : ");
                        pilihan1 = input_data_bahar.next().charAt(0);
                        if (pilihan1 == 'Y'){
                            continue mulai;
                        } else if (pilihan1 == 'N'){
                            System.exit(0);
                        } else {
                            System.out.println("Pilihan yang anda masukkan salah");
                        }
                    }
                    break;   
                }else if(pilih1 == 3 && jmlhpulsa < data.get_harga3())    {
                    System.out.println("Maaf pulsa anda tidak mencukupi untuk melakukan pengisian ini");
                    while(pilihan1 != 'Y' || pilihan1 != 'N'){
                        System.out.println("Apakah anda ingin kembali ke menu sebelumnya?");
                        System.out.print("Silahkan tekan [Y]kembali atau [N]berhenti : ");
                        pilihan1 = input_data_bahar.next().charAt(0);
                        if (pilihan1 == 'Y'){
                            continue mulai;
                        } else if (pilihan1 == 'N'){
                            System.exit(0);
                        } else {
                            System.out.println("Pilihan yang anda masukkan salah");
                        }
                    }
                    break; 
                }if(pilih1 == 4 && jmlhpulsa >= data.get_harga4())    {
                    jmlhpulsa -= pulsa.get_harga4();
                    koutaData += data.get_kouta4(); 
                    System.out.println("Selamat anda sukses melakukan pengisian kouta");
                    while(pilihan1 != 'Y' || pilihan1 != 'N'){
                        System.out.println("Apakah anda ingin kembali ke menu sebelumnya?");
                        System.out.print("Silahkan tekan [Y]kembali atau [N]berhenti : ");
                        pilihan1 = input_data_bahar.next().charAt(0);
                        if (pilihan1 == 'Y'){
                            continue mulai;
                        } else if (pilihan1 == 'N'){
                            System.exit(0);
                        } else {
                            System.out.println("Pilihan yang anda masukkan salah");
                        }
                    }
                    break;   
                }else if(pilih1 == 4 && jmlhpulsa < data.get_harga4())    {
                    System.out.println("Maaf pulsa anda tidak mencukupi untuk melakukan pengisian ini");
                    while(pilihan1 != 'Y' || pilihan1 != 'N'){
                        System.out.println("Apakah anda ingin kembali ke menu sebelumnya?");
                        System.out.print("Silahkan tekan [Y]kembali atau [N]berhenti : ");
                        pilihan1 = input_data_bahar.next().charAt(0);
                        if (pilihan1 == 'Y'){
                            continue mulai;
                        } else if (pilihan1 == 'N'){
                            System.exit(0);
                        } else {
                            System.out.println("Pilihan yang anda masukkan salah");
                        }
                    }
                    break; 
                }else{
                    System.out.println("Maaf input yang anda masukkan salah");
                    while(pilihan1 != 'Y' || pilihan1 != 'N'){
                        System.out.println("Apakah anda ingin kembali ke menu sebelumnya?");
                        System.out.print("Silahkan tekan [Y]kembali atau [N]berhenti : ");
                        pilihan1 = input_data_bahar.next().charAt(0);
                        if (pilihan1 == 'Y'){
                            continue mulai;
                        } else if (pilihan1 == 'N'){
                            System.exit(0);
                        } else {
                            System.out.println("Pilihan yang anda masukkan salah");
                        }
                    }   
                    break;
                }
            case 5 : 
                System.out.println("Terima kasih atas kunjungan anda");
                break;
            default : 
                System.out.println("");
                System.out.println("Pilihan yang anda masukkan salah, silahkan masukkan kembali");
            }
        }while (pilih != 5);
    }
}
