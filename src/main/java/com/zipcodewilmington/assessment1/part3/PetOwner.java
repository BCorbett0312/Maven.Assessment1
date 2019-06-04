package com.zipcodewilmington.assessment1.part3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
     String name;
     Pet[] pets;


    public PetOwner(String name, Pet... pets) {

        this.name = name;
        this.pets= pets;


        if(pets != null){
            for (Pet pet: pets){
                pet.setOwner(this);
            }
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        List<Pet> petList = new ArrayList<>(0);

        if(pets!= null){
            petList = Arrays.asList(getPets());
        }
        petList.add(pet);

        pets = petList.toArray(new Pet[petList.size()-1]);

    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {

        List<Pet> petList = new ArrayList<>(Arrays.asList(pets));

        int index= petList.indexOf(pet);
        petList.set(index, null);


        pets = petList.toArray(new Pet[petList.size()-1]);



    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        Boolean result = false;

        for(Pet element: pets){
            if(element.equals(pet)){
                result = true;
            }
        }

        return result;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer lowAge = Integer.MAX_VALUE;

        for(Pet element: pets){
            if(element.age < lowAge){
                lowAge = element.age;
            }
        }



        return lowAge;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer highAge = Integer.MIN_VALUE;

        for(Pet element: pets){
            if (element.age> highAge){
                highAge = element.age;
            }
        }

        return highAge;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        int sumAge = 0;
        float avgAge;

        for (Pet element: pets){
            sumAge+= element.age;
        }


        avgAge = (sumAge/pets.length);

        return avgAge;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return pets;
    }
}
