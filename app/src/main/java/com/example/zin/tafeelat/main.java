//public class main {
//    public static void main(String[] args) {
//        m mf = new m();
//        m mc = new m();
//        m mt = new m();
//        m mfo = new m();
//
//        boolean firsta=false,seconda=false,thirda=false,fortha=false;
//        String firstshatr = "11010101101110";
//        String secondshatr = "11010101101010";
//
//        //for mf
//        mf.first = true;
//        mf.fourth = true;
//        //formc
//        mc.first = true;
//        mc.fourth = true;
//        //for mt
//
//        mt.first = true;
//        mt.fourth = true;
//
//        //for mfo
//
//        mfo.first = true;
//        mfo.second = true;
//        mfo.third = true;
//    //
//
//        if(mf.findtaffelah(firstshatr,0)>-1){
//            firsta = true;
//        }
//        if (mc.findtaffelah(firstshatr, mf.findtaffelah(firstshatr,0))>-1) {
//            seconda = true;
//        }
//        if (mt.findtaffelah(secondshatr,0)>-1) {
//            thirda = true;
//
//        }
//        if (mfo.findtaffelah(secondshatr,mt.findtaffelah(secondshatr,0))>-1){
//            fortha = true;
//        }
//        System.out.println(firsta);
//        System.out.println(seconda);
//        System.out.println(thirda);
//        System.out.println(fortha);
//
//    }
//}
//
//
//
///*
//
//
//
//
//
//public class main {
//
//    public static void main(String[] args) {
//
//        int counter=0;
//        String result=null;
//        String b = "أَلَا فِي سَبِيلِ المَجْدِ مَا أَنَا فَاْعِلُ";
//        for (int i = 0; i < b.length(); i++) {
//            char a = b.charAt(i);
//
//            if (methods._IsItHarakah(a)){
//                System.out.print('1');}
//            else if (methods._IsItSokon(a)) {
//                System.out.print('0');
//            }else if (methods._IsItShadah(a)) {
//                System.out.print("01");
//                i++;
//            } else if (methods._IsItMad(a)) {
//                if(methods._IsItHarakah(b.charAt(i+1))==false&&methods._IsItAL(a,b.charAt(i+1))==false){
//                    System.out.print('0');}
//                else{
//
//                }
//            }else if (i+1<=b.length()&&i+2<=b.length()) {
//                if(methods._IsItAL(a,b.charAt(i+1))){
//
//                    if (methods._IsItSunny(a,b.charAt(i+1),b.charAt(i+2))){
//                        System.out.print("01");
//
//                        i += 2;
//                        if(methods._IsItHarakah(b.charAt(i+3))){
//                            i++;
//                        }
//                    }else {
//                        System.out.print('0');
//                    }
//            }}else if(methods._IsItTanween(a)) {
//                System.out.print("10");
//            }else {
//                    //System.out.print('L');
//                }
//            }
//
//            }
//        }
//
//
// class methods {
//    public static String _FindTypeOfAl(char a, char b, char c){
//
//
//        return "";
//    }
//     public static boolean _IsItHarakah(char a) {
//         switch (a) {
//             case 'َ':
//             case 'ِ':
//             case 'ُ':
//                 return true;}
//         return false;
//     }
//     public static boolean _IsItTanween(char a) {
//         switch (a) {
//             case 'ً':
//             case 'ٍ':
//             case 'ٌ':
//                 return true;}
//         return false;
//     }
//     public static boolean _IsItMad(char a) {
//         switch (a) {
//             case 'ا':
//             case 'و':
//             case 'ي':
//             case 'ى':
//                 return true;}
//         return false;
//     }
//     public static boolean _IsItSokon(char a) {
//         if (a == 'ْ') {return true;}
//         return false;}
//     public static boolean _IsItShadah(char a) {
//         if (a == 'ّ') { return true; }
//         return false;}
//
//     public static boolean _IsItAL(char a,char after){
//         if (a == 'ا'&& after == 'ل'){
//             return true;
//         }
//         return false;
//     }
//     public static boolean _IsItSunny(char a,char aftera,char aftera2){
//         if (_IsItAL(a,aftera)&&_IsItShadah(aftera2)){
//             return true;
//         }
//         return false;
//     }
//     public static boolean _IsItMoony(char a,char aftera,char aftera2){
//         if (_IsItAL(a,aftera)&&_IsItHarakah(aftera2)==false&&_IsItShadah(aftera2)==false||_IsItSokon(aftera2)){
//             return true;
//         }
//         return false;
//     }
//
//
// }
//
//
//
///*
//    public class main {
//        public static String findharakah(char a){
//            switch (a){
//                case 'َ':
//                    return "1";
//                case 'ً':
//                    return "10";
//                case 'ُ':
//                    return "1";
//
//                case 'ٌ':
//                    return "10";
//
//                case 'ِ':
//                    return "1";
//
//                case 'ٍ':
//                    return "10";
//
//                case 'ْ':
//                    return "0";
//                case 'ّ':
//                    return "01";
//
//            }
//            return "wrong";
//        }
//        public static String IsItAL(char a,char aftera,char aftera2){
//            if (a == 'ا'&&aftera == 'ل'&& findharakah(aftera2)=="wrong"){
//                return "0";
//            }
//            return "wrong";
//        }
//        public static void main(String[] args) {
//
//            Scanner in= new Scanner(System.in);
//
//
//            String b = "وَقَفْتُ وَمَا كَانَ الّذِي سَالَ أَدمُعٌ";
//
//            for (int i = 0; i < b.length(); i++) {
//                switch (b.charAt(i)){
//                    case 'ا':
//                        if(b.charAt(i+1)==' '){
//                            System.out.print("0");
//                        }else if(IsItAL(b.charAt(i),b.charAt(i+1),b.charAt(i+2))!="wrong"&&b.charAt(i+3)!='ّ'){
//
//                            System.out.print(IsItAL(b.charAt(i),b.charAt(i+1),b.charAt(i+2)));
//                        }else if(b.charAt(i+3)!='ّ'){
//                            System.out.print("0");
//                        }
//
//                        break;
//                    case 'و':
//                        if (findharakah(b.charAt(i+1))=="wrong"){
//                            System.out.print("0");
//                        }
//                        break;
//                    case 'ي':
//                        if (findharakah(b.charAt(i+1))=="wrong"){
//                            System.out.print("0");
//                        }
//                        break;
//                    case 'ى':
//                        if (findharakah(b.charAt(i+1))=="wrong"){
//                            System.out.print("0");
//                        }
//                        break;
//                    default:
//                        if(findharakah(b.charAt(i))!= "wrong" ){
//
//                            System.out.print(findharakah(b.charAt(i)));
//                        }//ifelif
//                }//switch
//            }//for
//            System.out.println("");
//
//
//
//
//        }
//
//    }
//*/