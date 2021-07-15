package java8;

import java.util.*;

public class ToysDistribution {

    public static void main(String[] args) {

        List<String> toys = Arrays.asList("Toy1","Toy2","Toy3","Toy4","Toy5","Toy6","Toy7","Toy8","Toy9","Toy10");
        Map<String,List<String>> childrenToysCollection = new HashMap<>();
        childrenToysCollection.put("Childer1",new ArrayList<>());
        childrenToysCollection.put("Childer2",new ArrayList<>());
        childrenToysCollection.put("Childer3",new ArrayList<>());

        int toyIndex = 0;

        for (String toy: toys) {

          final String index = String.valueOf(toyIndex);
          Optional<String> child =
                  childrenToysCollection.entrySet().stream().filter(e->e.getValue().size()==Integer.valueOf(index))
                          .map(Map.Entry::getKey).findFirst();
            if(!child.isPresent()) {

                final String newIndex = String.valueOf(toyIndex+1);
                toyIndex++;
                child =
                        childrenToysCollection.entrySet().stream().filter(e->e.getValue().size()==Integer.valueOf(newIndex))
                                .map(Map.Entry::getKey).findFirst();
            }
            if(child.isPresent()) {
                List<String> childToysList = childrenToysCollection.get(child.get());
                childToysList.add(toy);
                childrenToysCollection.put(child.get(),childToysList);
            }
        }

        childrenToysCollection.forEach((key,value)->{
            System.out.println("Children Name: "+key+" Toy Collection: "+value);
        });
    }



}
