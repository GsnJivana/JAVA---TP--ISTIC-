


# Conventions et Règles du TP de Java

Ce document décrit les conventions et règles à suivre pour le développement des exercices du TP en Java.

---

## **1. Structure des Répertoires**

Pour chaque exercice du TP :
- **Créer un répertoire dédié** avec un nom **descriptif** qui reflète l’exercice.



## **2. Conventions de Nommage**

### **2.1. Noms des Répertoires et Fichiers**
- Utiliser des noms **clairs et explicites**.
- Éviter les abréviations obscures.
- Utiliser le format `snake_case` pour les répertoires et fichiers.
  Exemple : `exercice_calcul_surface_cercle/`

### **2.2. Noms des Variables et Méthodes**
- Utiliser le format **camelCase** pour les variables et méthodes.
- Choisir des noms **significatifs** qui décrivent leur rôle.
  Exemple :
  ```java
  // ❌ À éviter
  int a;
  int b;

  // ✅ À privilégier
  int nombreEtudiants;
  double rayonCercle;
  ```

### **2.3. Noms des Classes**
- Utiliser le format **PascalCase**.
  Exemple : `CalculMoyenne`, `GestionEtudiants`

---

## **3. Structure du Code**

### **3.1. Méthode `main`**
- La méthode `main` doit **orchestrer** les appels aux méthodes et **ne pas contenir de logique complexe**.
- Elle doit être **propre, lisible et concise**.

### **3.2. Modularisation**
- **Découper le code en méthodes** pour chaque fonctionnalité.
- Chaque méthode doit avoir une **responsabilité unique**.


---

## **4. Bonnes Pratiques de Codage**

### **4.1. Affichage du Rôle du Programme**
- Au début de chaque programme, ajouter un `System.out.println()` pour expliquer ce que fait le programme.
  Exemple :
  ```java
  public static void main(String[] args) {
      System.out.println("Ce programme calcule la moyenne de trois notes saisies par l'utilisateur.");
      // ... reste du code
  }
  ```

### **4.2. Interaction avec l’Utilisateur**
- Privilégier les **fonctions de lecture au clavier** (`Scanner`) pour rendre le programme interactif.
  Exemple :
  ```java
  Scanner scanner = new Scanner(System.in);
  System.out.print("Entrez le rayon du cercle : ");
  double rayon = scanner.nextDouble();
  ```

### **4.3. Lisibilité et Propreté du Code**
- **Indenter correctement** le code.
- Éviter les lignes trop longues.


---

## **5. Exemple de Structure de Code**

```java
// Nom du fichier : CalculMoyenne.java
// Répertoire : tp1_exercice_calcul_moyenne/

import java.util.Scanner;

public class CalculMoyenne {

    public static void main(String[] args) {
        System.out.println("Ce programme calcule la moyenne de trois notes.");

        double[] notes = lireNotes();
        double moyenne = calculerMoyenne(notes);
        afficherResultat(moyenne);
    }

    // Méthode pour lire les notes
    private static double[] lireNotes() {
        Scanner scanner = new Scanner(System.in);
        double[] notes = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Entrez la note " + (i + 1) + " : ");
            notes[i] = scanner.nextDouble();
        }

        return notes;
    }

    // Méthode pour calculer la moyenne
    private static double calculerMoyenne(double[] notes) {
        double somme = 0;
        for (double note : notes) {
            somme += note;
        }
        return somme / notes.length;
    }

    // Méthode pour afficher le résultat
    private static void afficherResultat(double moyenne) {
        System.out.printf("La moyenne est : %.2f\n", moyenne);
    }
}
```



## **6. Validation des Consignes**
- **Respecter strictement les consignes** de chaque exercice.
- Vérifier que le programme répond bien aux exigences avant de le soumettre.

## 7. Gestion des Branches Git

- **Chaque membre de l’équipe doit créer une branche personnelle** à partir de la branche principale (`main` ou `master`).
  - Le nom de la branche doit suivre le format :
    ```
    feature/nom_du_developpeur
    ```
    Exemple :
    ```
    feature/jivana
    feature/ornella
    ```

- **Tous les exercices attribués à un membre** doivent être développés dans sa branche personnelle.
- **Faire des commits réguliers** avec des messages clairs et descriptifs.





