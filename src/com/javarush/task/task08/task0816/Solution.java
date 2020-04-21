package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;



/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("asdfg", dateFormat.parse("JUNE 1 2012"));
        map.put("zxcvb", dateFormat.parse("JANUARY 5 2010"));
        map.put("qazxcv", dateFormat.parse("APRIL 1 2012"));
        map.put("erfvcxd", dateFormat.parse("AUGUST 1 2012"));
        map.put("poiuytr", dateFormat.parse("SEPTEMBER 1 2012"));
        map.put("lkjhggfd", dateFormat.parse("JULY 1 2012"));
        map.put("mnnbghhy", dateFormat.parse("DECEMBER 1 2012"));
        map.put("jgggfstyys", dateFormat.parse("MAY 1 2012"));
        map.put("jgggfstyyfsvsdv", dateFormat.parse("JUNE 1 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Map<String, Date> map1 = new HashMap<>();
        for (Map.Entry<String, Date> pair : map.entrySet()) {
            map1.put(pair.getKey(), pair.getValue());
        }


        int month;
        // Iterator<Map.Entry<String, Date>> iterator = map1.entrySet().iterator();
        //  while (iterator.hasNext()) {
        for (Map.Entry<String, Date> pair : map1.entrySet()) {
            Date date = pair.getValue();
            month = pair.getValue().getMonth();
            if (month == 5 || month == 6 || month == 7) map.remove(pair.getKey());
        }
        //   month = date.getMonth();
        // if (month==6 || month==7 || month ==8) iterator.remove();

        //    if (iterator.next().getValue().toString().contains("JUNE")) iterator.remove();
        //if (iterator.next().getValue().toString().contains("JULY")) iterator.remove();
        //if (iterator.next().getValue().toString().contains("AUGUST")) iterator.remove();
        //          list.add(pair.getKey());
        //    }
        //       if (pair.getValue().toString().contains("JULY")) {
        //          list.add(pair.getKey());
        //    }
        //     if (pair.getValue().toString().contains("AUGUST")) {
        //        list.add(pair.getKey());
        //     }
        // }
        // for (Map.Entry<String, Date> pair : map.entrySet()) {
        //     for (String s : list) {
        //         map.remove(s);
        //    }

        //   }
        //  for (Map.Entry<String, Date> pair : map.entrySet()) {
        //    System.out.println(pair.getKey() + " " + pair.getValue());
    }

//}

        public static void main(String[] args) throws ParseException {
          removeAllSummerPeople(createMap());


        }

    }