package com.tecmilenio.ormuz;

import java.util.*;

public class Main {

    List<String> strings = new ArrayList<String>();

    public static void main(String[] args) {
        Main main = new Main();
        main.loadStrings(
             "Kaan",
             "The Wire",
             "Dragon Ball",
             "Tacos Pony",
             "Discord",
             "Leon",
             "Adrian",
             "Ronaldo",
             "WWI",
            "Xoloitzcuintle");

             var sortLengthByAnonimousClass = main.sortLengtAnonimousClass();
             System.out.println("\n Length \n");
             System.out.println("\n Anonimus Class \n");
             main.showList(sortLengthByAnonimousClass);

             var sortLengthByLamda = main.sortLengtLamda();
             System.out.println("\n Lambda \n");
             main.showList(sortLengthByLamda);

             var sortLengthByReference = main.sortLengtReference();
             System.out.println("\n Reference \n");
             main.showList(sortLengthByReference);

             var sortAlphabeticByAnonimousClass = main.sortAlphabeticAnonimousClass();
             System.out.println("\n Alphabetic \n");
             System.out.println("\n Anonimus Class \n");
             main.showList(sortAlphabeticByAnonimousClass);

             var sortAlphabeticByLambda =main.sortAlphabeticLamda();
             System.out.println("\n Lambda \n");
             main.showList(sortAlphabeticByLambda);

             var sortAlphabeticByReference =main.sortAlphabeticReference();
             System.out.println("\n Reference \n");
             main.showList(sortAlphabeticByReference);


    }

    public void loadStrings(String... strings) {
        for (var string : strings) this.strings.add(string);
    }

    public List<String> sortLengtAnonimousClass() {
        List<String> strings = this.strings;
        strings.sort(new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return str1.length() - str2.length();
            }
        });
        return strings;
    }

    public List<String> sortLengtLamda() {
        List<String> strings = this.strings;
        strings.sort((str1, str2) -> str1.length() - str2.length());
        return strings;
    }

    public List<String> sortLengtReference() {
        List<String> strings = this.strings;
        SortLengt sortLengt = new SortLengt();
        strings.sort(sortLengt::compare);
        return strings;
    }

    class SortLengt implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return o1.toString().length() - o2.toString().length();
        }
    }

        public List<String> sortAlphabeticAnonimousClass() {
            List<String> strings = this.strings;
            strings.sort(new Comparator<String>() {
                @Override
                public int compare(String str1, String str2) {
                    return str1.compareToIgnoreCase(str2);
                }
            });
            return strings;
        }

        public List<String> sortAlphabeticLamda() {
            List<String> strings = this.strings;
            strings.sort((str1, str2) -> str1.compareToIgnoreCase(str2));
            return strings;
        }

        public List<String> sortAlphabeticReference() {
            List<String> strings = this.strings;
            SortAlphaetic sortAlphabetic = new SortAlphaetic();
            Collections.sort(strings, sortAlphabetic::compare);
            return strings;
        }

        class SortAlphaetic implements Comparator {
            @Override
            public int compare(Object o1, Object o2) {
                return o1.toString().compareToIgnoreCase(o2.toString());
            }
        }
        public void showList(List<String> strings){
            strings.forEach(System.out::println);
        }

    }
