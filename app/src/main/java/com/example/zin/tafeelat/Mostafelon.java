package com.example.zin.tafeelat;

public class Mostafelon {

    /*
     اصطلاحات عروضية:
      الصحة: خلو التفعيلة من الزحافات والعلل --> مستفعلن: 1010110
      الخبن: حذف الثاني الساكن من السبب الخفيف --> متفعلن: 110110
      الطي: حذف الرابع الساكن من السبب الخفيف --> مستعلن: 101110
      الخبل: الخبن (مستفعلن->متفعلن) + الطي --> متعلن: 11110
      القطع: حذف ساكن الوتد المجموع (علن) وتسكين ما قبله --> مستفعلْ: 101010
     */

    /*
    // الأبحر المحتوية على (مستفعلن): الرجز، البسيط، السريع، المنسرح، المجتث
    (الحالة الأخيرة تحتاج لشيء من التفصيل)
    1. الرجز، وفيه الاحتمالات الخمسة (مستفعلن، متفعلن، مستعلن، متعلن، مستفعل)

    للتفعيلتين الأوليين من كل شطر، أربعة احتمالات:
    صحيحة: 1010110
    مخبونة: 110110
    مطوية: 101110
    مخبولة: 11110

    للتفعيلة الثالثة من الشطر الأول (العروض)، خمسة احتمالات:
    صحيحة: 1010110
    مخبونة: 110110
    مطوية: 101110
    مخبولة: 11110
    (خاصة بالتصريع) مقطوعة: 101010

    للتفعيلة الثالثة من الشطر الثاني (الضرب)، خمسة احتمالات:
    صحيحة: 1010110
    مخبونة: 110110
    مطوية: 101110
    مخبولة:  11110
    مقطوعة: 101010
    *******************

    2. البسيط

    ترد التفعيلة مرتين في كل شطر

لكافة التفعيلات في كل شطر، ثلاثة احتمالات:
   صحيحة: 1010110
    مخبونة: 110110
    مطوية: 101110
    *****************


    3. السريع

    ترد التفعيلة مرتين في كل شطر

لكافة التفعيلات في كل شطر، أربعة احتمالات:
    صحيحة: 1010110
    مخبونة: 110110
    مطوية: 101110
    مخبولة:  11110
    ***************


    4. المنسرح

للتفعيلة الأولى في كل شطر، ثلاثة احتمالات:
   صحيحة: 1010110
    مخبونة: 110110
    مطوية: 101110
    مخبولة:  11110


    للتفعيلة الثانية في الشطر الأول (العروض)، ثلاثة احتمالات:
    صحيحة: 1010110
    مطوية: 101110
    (خاصة بالتصريع) مقطوعة: 101010

    للتفعيلة الثانية في الشطر الثاني (الضرب)، ثلاثة احتمالات:
    مطوية: 101110
    مقطوعة: 101010
    ********************

    5. الخفيف

    ترد مرة في كل شطر

 لكافة التفعيلات في كل شطر، أربعة احتمالات:
    صحيحة: 1010110
    مخبونة: 110110
    مطوية: 101110
    ****************

    6. المجتث

    ترد مرة في كل شطر

    للتفعيلة في كل شطر، ثلاثة احتمالات:
    صحيحة: 1010110
    مخبونة: 110110
    مطوية: 101110
    ************

    7. المقتضب (يحال إلى: فاعلن مفاعلتن)
     */

    String first_saheeh = "1010110";
    String second_makhboon = "110110";
    String third_matwi = "101110";
    String forth_khabl = "11110";
    String fifth_magtooh = "101010";
}
