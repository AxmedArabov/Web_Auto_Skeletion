
Feature: test
@Axmed
Scenario: Enter Kapitalbankaaa and do something
  Given go to kapitalbank az
  When Click Mortagage loans
  And Click to Muraciet Et
  And Click Ipoteka novu Label
  And Choose ipotekanin novu
  And Fill Fin kod
  And Fill  Number
  And Click Aile Veziyyeti
  And Click Evli
  And Add Aile Uzvlerinin sayi
  And Click Resmi Emekhaqqi
  And Click Teqaud Muavinet
  And Click Diger Gelir Menbeyi
  And Fill Orta Ayliq Xalis Menfeet
  And Fill Fealiyyet Muddeti
  And Click Beli
  And Fill Bonus Meblegi
  And Click Muraciet Et Ipoteka
  Then See the result
