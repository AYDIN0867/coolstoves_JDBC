Feature:Execute Query

@DB
  Scenario: Deposits tablosundan amount degerine gore user_id dogrulama testi.

     #Data base içindeki "deposits" tablosunda
    # "amount" değeri 100 $ ile 500 $ dolar arasında olan
    # user_id'leri doğrulayınız

# SURUCUYU YUKLE..... Configuration.prpperties icinde artık var oldugundan bu adımı atlıyoruz...
#  DATABASE BAGLANTISINI KUR ...Hook class nın içinde oldugundan atlanır
* Deposits tablosu için SQL SORGULARI HAZIRLANIR ve ÇALIŞTIRILIR
* Deposits tablosundan donen SONUÇLARI İŞLENİR
# DATABASE KAYNAKLARI KAPAT -- bua adım da hooks class ının içinde oldugundan atlanır



