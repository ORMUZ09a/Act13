package com.tecmilenio.ormuz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> stringslist = new ArrayList<>();
        stringslist.add("Kaan");
        stringslist.add("The wire");
        stringslist.add("Dragon Ball");
        stringslist.add("Discord");
        stringslist.add("Tacos Pony");
        stringslist.add("Leon");
        stringslist.add("Adrian");
        stringslist.add("Ronaldo");
        stringslist.add("WWI");
        stringslist.add("Xoloitzcuintle");


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

    public List<String> sortLengttLamda() {
        List<String> strings = this.strings;
        strings.sort((str1, str2) -> str1.length() - str2.length());
        return strings;
    }

    public List<String> sortLengttReference() {
        List<String> strings = this.strings;
        SortLengt sortLengt = new SortLengt();
        strings.sort(sortLengt::compare);
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
        }

        class SortAlphaetic implements Comparator {
            @Override
            public int compare(Object o1, Object o2) {
                return o1.toString().compareToIgnoreCase(o2.toString());
            }
        }

    }
