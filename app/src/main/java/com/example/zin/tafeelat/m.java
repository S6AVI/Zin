

    /*
    اصطلاحات عروضية:
    الصحة: خلو التفعيلة من الزحافات والعلل --> مفاعيلن: 1101010
    الكف: حذف السابع الساكن --> مفاعيلُ: 110101
    الحذف: حذف السبب الخفيف (لن) من آخر التفعيلة --> مفاعي: 11010
    القصر: حذف ساكن السبب الأخير (لن) وتسكين ما قبله --> مفاعيلْ: 110100
    القبض: حذف الخامس الساكن --> مفاعلن: 110110

     */
// الأبحر المحتوية على (مفاعيلن):

    // الهزج، وفيه الاحتمالات (مفاعيلن، مفاعيلُ، مفاعيلْ، مفاعي)
    /*
    للتفعيلة الأولى في أي الشطرين، احتمالان:
    صحيحة: 1101010
    مكفوفة: 110101
    ***********

    للتفعيلة الثانية في الشطر الأول (العروضِ)، احتمالان:
    صحيحة: 1101010
    مكفوفة: 110101

    حالات خاصة بالتصريع:
    محذوفة: 11010
    مقصورة: 110100
    *****************

    للتفعيلة الثانية في الشطر الثاني (الضرب)، ثلاثة احتمالات:
    صحيحة: 1101010
    محذوفة: 11010
    مقصورة: 110100


    // الطويل: وفيه الاحتمالات (مفاعيلن، مفاعلن، مفاعي)

    ترد التفعيلة مرتين في الشطر الواحد

    التفعيلة الأولى في كل شطر لها احتمالان:
    صحيحة: 1101010
    مقبوضة: 110110
    ***********************

    التفعيلة الثانية في الشطر الأول (العروض)، لها احتمال واحد:
    مقبوضة: 110110

    حالات خاصة بالتصريع:
    صحيحة: 1101010
    مقبوضة: 110110
    محذوفة: 11010
    ******************


    التفعيلة الثانية في الشطر الثاني (الضرب)، لها ثلاثة احتمالات:
    صحيحة: 1101010
    مقبوضة: 110110
    محذوفة: 11010
     */
    public class m {



    boolean first,second,third,fourth,fifth;

    public int findtaffelah(String a, int start){


        if(first==true&&isFirst(a.substring(start,start+7))){
            System.out.println(a.substring(start,start+7));
            return 7;
        } else if (second==true&&isSecond(a.substring(start,start+4))) {
            return 5;
        } else if (third==true&&isThird(a.substring(start,start+5))) {
            return 6;
        } else if (fourth==true&&isFourth(a.substring(start,start+5))) {
            return 6;
        } else if (fifth==true&&isFifth(a.substring(start,start+5))) {
            return 6;
        }else {

            return -1;
        }
    }




    boolean isFirst(String a){
        if(a.equals( "1101010") ){
            return true;
        }else {
        return false;
    }}
    boolean isSecond(String a){
        if(a.equals("11010")){
            return true;
        }
        return false;
    }
    boolean isThird(String a){
        if(a.equals("110100") ){
            return true;
        }
        return false;
    }
    boolean isFourth(String a){
        if(a.equals("110101")){
            return true;
        }
        return false;
    }
    boolean isFifth(String a){
        if(a.equals("110110") ){
            return true;
        }
        return false;
    }
    String first_saheeh = "1101010";  // الهزج & الطويل
    String scnd_mahthoof =  "11010"; // الهزج & الطويل
    String third_magsoor = "110100";  // الهزج
    String forth_makfoof = "110101";  // الهزج
    String fifth_magbood = "110110";  // الهزج & الطويل

}
