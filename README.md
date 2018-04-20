# Activity lifecycle(Aktiviti Yaşam Döngüsü)


![alt text](https://github.com/UtkuGlsvn/Activity_lifecycle/blob/master/activity_lifecycle.png "Activity lifecycle")


 ### onCreate() ###
 
 Etkinliğin ilk oluştuğu anda çalışır.Etkinliği kapatıp(onDestroyed) yaptıktan sonra tekrar çalışır
  ### Onstart() ###
 
 Etkinlik kullanıcı tarafından görünmeye başlandığında oluşur. Oncreate'den veya onrestartt'an sonra çalışır
  ### onResume() ###
 
 Etkinlik devam ederken.Onstart'dan veya onPause'dan sonra çalışır.
 
   ### onPause() ###
 
Kullanıcı etkinliği alta attığında yada farklı bir activitye geçtiğinde çalışır.

   ### onStop() ###
 
Mevcut etkinlik durduğunda çalışır.Onpause'dan sonra çalışır

   ### onRestart() ###
 
Durmuş bir etkinlikten sonra tekrar çağırdığında bu metot çalışır.

   ### onDestroy() ###
 
Etkinlik tamamen kapatıldığında çalışır.Tekrar etkinlik açılırsa onCreate metoduyla tekrar hayata döner
