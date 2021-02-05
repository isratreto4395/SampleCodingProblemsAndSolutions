package creatingArrayListAndLinkedListFromAClass;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {
    public static void main(String[] args) {

        creatingClass();

    }

    public static void creatingClass(){
        CommunityClass indiv = new CommunityClass("Aisha",24,"Asian",'Y');
        CommunityClass indiv2 = new CommunityClass("Sulaiman",13,"White",'Y');
        CommunityClass indiv3 = new CommunityClass("Jose",55,"Hispanic or Latino",'Y');
        CommunityClass indiv4 = new CommunityClass("Minji",26,"Asian",'Y');
        CommunityClass indiv5 = new CommunityClass("Kai",27,"Native Hawaiian or Other Pacific Islander",'N');
        CommunityClass indiv6 = new CommunityClass("Kotoko",33,"Asian",'N');
        CommunityClass indiv7 = new CommunityClass("Angeni",65,"American indian or Alaska Native",'Y');
        CommunityClass indiv8 = new CommunityClass("Chelsea",36,"White",'N');

        ArrayList<CommunityClass> com = new ArrayList<>();
        com.add(indiv);
        com.add(indiv2);
        com.add(indiv3);
        com.add(indiv4);
        com.add(indiv5);
        com.add(indiv6);
        com.add(indiv7);
        com.add(indiv8);

        System.out.println(com.size());

        System.out.println();

        //Iterate to get all the values from the communityClass object

        Iterator<CommunityClass> iterate = com.iterator();
        while(iterate.hasNext()) {
            CommunityClass community = iterate.next();
            System.out.println(community.neighborName + " , " + community.neighborAge + " , " + community.neighborEthnicity + " , " + community.neighborReligion);
        }

    }
























}
