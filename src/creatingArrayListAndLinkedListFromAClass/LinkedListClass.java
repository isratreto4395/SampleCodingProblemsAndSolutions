package creatingArrayListAndLinkedListFromAClass;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedListClass link = new LinkedListClass();
        link.creatingALinkedList();
    }

    public void creatingALinkedList(){
        CommunityClass indiv = new CommunityClass("Aisha",24,"Asian",'Y');
        CommunityClass indiv2 = new CommunityClass("Sulaiman",13,"White",'Y');
        CommunityClass indiv3 = new CommunityClass("Jose",55,"Hispanic or Latino",'Y');
        CommunityClass indiv4 = new CommunityClass("Minji",26,"Asian",'Y');
        CommunityClass indiv5 = new CommunityClass("Kai",27,"Native Hawaiian or Other Pacific Islander",'N');
        CommunityClass indiv6 = new CommunityClass("Kotoko",33,"Asian",'N');
        CommunityClass indiv7 = new CommunityClass("Angeni",65,"American indian or Alaska Native",'Y');
        CommunityClass indiv8 = new CommunityClass("Chelsea",36,"White",'N');

        LinkedList<CommunityClass> linked = new LinkedList<>();

        linked.add(indiv);
        linked.add(indiv2);
        linked.add(indiv3);
        linked.add(indiv4);
        linked.add(indiv5);
        linked.add(indiv6);
        linked.add(indiv7);
        linked.add(indiv8);

        System.out.println(linked.size());

        System.out.println();

        //Iterate through to print all the elements from the CommunityClass object

        Iterator<CommunityClass> iterates = linked.iterator();
        while(iterates.hasNext()){
            CommunityClass commun = iterates.next();
            System.out.println(commun.neighborName+" , "+commun.neighborAge+" , "+commun.neighborEthnicity+" , "+commun.neighborReligion);
        }


    }























}
