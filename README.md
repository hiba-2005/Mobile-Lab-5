# 📱 LAB 5 – Convertisseur Température & Distance (Fragments + Onglets)

## 📚 Cours
**Programmation Mobile Android avec Java**
---

## 🎯 Objectif du TP
Ce laboratoire consiste à développer une application Android utilisant :
- des **fragments**
- des **onglets (TabLayout + ViewPager2)**

L’application permet de :
- convertir les températures (**°C ↔ °F**)
- convertir les distances (**Km ↔ Miles**)
- afficher un menu **Quitter**
- intercepter le bouton **Retour** avec confirmation

---

## ⚙️ Fonctionnalités réalisées

### 🔹 Onglet 1 : Température
- Saisie d’une valeur numérique
- Choix du type de conversion :
  - Celsius → Fahrenheit
  - Fahrenheit → Celsius
- Affichage du résultat avec 2 décimales

### 🔹 Onglet 2 : Distance
- Saisie d’une distance
- Choix du type de conversion :
  - Km → Miles
  - Miles → Km
- Affichage du résultat dynamique

### 🔹 Navigation
- Navigation entre onglets avec **TabLayout**
- Glissement horizontal avec **ViewPager2**

### 🔹 Menu & Interaction
- Menu avec option **Quitter**
- Confirmation avant fermeture via **AlertDialog**

---
### 🔍 Principe de fonctionnement
     1-L’activité principale contient :
      une barre d’onglets (TabLayout)
      un conteneur (ViewPager2)
    2-ViewPagerAdapter fournit :
      TempFragment
      DistanceFragment
    3-Chaque fragment fonctionne indépendamment :
      récupère les entrées utilisateur
      effectue le calcul
      affiche le résultat
    4-Le bouton Retour est intercepté pour afficher une boîte de confirmation
---

### 📐 Formules utilisées
   ## Température
°C → °F :
F = (1.8 × C) + 32
°F → °C :
C = (F - 32) / 1.8
  ##  Distance
Km → Miles :
Miles = Km × 0.6214
Miles → Km :
Km = Miles / 0.6214

## 🖥️ Résultat attendu
Deux onglets : Température et Distance
Interface simple et intuitive
Conversion correcte avec affichage dynamique
Message d’erreur si champ vide
Confirmation lors de la fermeture


https://github.com/user-attachments/assets/9143089b-b26b-4727-9d14-233c1de3158b

## 🧑‍💻 Auteur

Nom : OUIROUANE HIBA
Lab : LAB 5 – Convertisseur Android
Langage : Java

## ✅ Conclusion

Ce TP a permis de maîtriser :

la navigation entre fragments avec onglets
l’utilisation de ViewPager2
la gestion des interactions utilisateur
