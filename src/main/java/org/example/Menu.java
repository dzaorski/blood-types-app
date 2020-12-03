package org.example;

public class Menu {
    private static final String MENU = "Main menu";

    private static final String AB0_BLOOD = "Chose your AB0 blood status";

    private static final String RH_BLOOD = "Chose your Rh blood status";

    public static void showMenu() {
        System.out.println(MENU);
        System.out.println(AB0_BLOOD);
        displayOptions(AB0.class);
        System.out.println(RH_BLOOD);
        displayOptions(RH.class);
    }

    private static <E> void displayOptions(Class<E> enumClass) {
        for (int i = 0; i < enumClass.getEnumConstants().length; i++) {
            System.out.println(" - " + enumClass.getEnumConstants()[i]);
        }
    }
}
