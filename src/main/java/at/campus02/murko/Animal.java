package at.campus02.murko;

public class Animal {
    private String name;
    private int age;
    private String species;
    private String animalLoud;

    public Animal() {
//        this.name = name;
//        this.age = age;
//        this.species = species;
    }

    public String giveAnimalLoud() {
       if(species == "Hund")
       {
           return "Wuff";
       }
       else if (species == "Löwe")
       {
           return "Roarr";
       }
       else return "Miau";
    }

    public String getNameAndAge() {
        return String.format("%s %d", name, age);
    }

    public String ageCategory() {
        if (age <= 2 && age >= 0) {
            return "baby animal";
        } else if (age <= 4 && age >= 2) {
            return "young animal";
        } else
            return "old animal";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    public String getAnimalLoud() {
        return animalLoud;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setAnimalLoud(String animalLoud) {
        this.animalLoud = animalLoud;
    }
}
