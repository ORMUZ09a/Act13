package com.tecmilenio.ormuz;

import java.util.*;

public class Main {

    private List<String> strings = new ArrayList<String>();

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
             strings.add("Kaan");
             strings.add("The Wire");
             strings.add("Dragon Ball");
             strings.add("Tacos Pony");
             strings.add("Discord");
             strings.add("Leon");
             strings.add("Adrian");
             strings.add("Ronaldo");
             strings.add("WWI");
             strings.add("Xoloitzcuintle");

        Iterator it = strings.iterator();
        while(it.hasNext())
            System.out.println(it.next());

             var sortLengthAnonimousClass = Main.sortLengtAnonimousClass();
             Main.showList(SortLengtByAnonimousClass);
             var sortLengthLamda = Main.sortLengtLamda();
             Main.showList(SortLengtByLamda);
             var sortLengthReference = Main.sortLengtReference();
             Main.showList(SortLengtByReference);

             var sortAlphabeticAnonimousClass = Main.sortAlphabeticAnonimousClass();
             Main.showList(SortAlphaeticByAnonimousClass);
             var sortAlphabeticLambda = Main.sortAlphabeticLamda();
             Main.showList(SortAlphaeticByLamda);
             var sortAlphabeticReference = Main.sortAlphabeticReference();
             Main.showList(SortAlphaeticByReference);
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
