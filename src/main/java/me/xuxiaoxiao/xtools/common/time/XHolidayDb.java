package me.xuxiaoxiao.xtools.common.time;


import java.util.Arrays;
import java.util.Comparator;

/**
 * 节假日数据库，保存了节假日，调休的一些数据，含义为0x(1位日期类型)（1位月份）（2位日期）
 */
class XHolidayDb {
    public static final Integer[] HOLIDAY_2000 = {0x3104, 0x3105, 0x3106, 0x2107, 0x2108, 0x2109, 0x210a, 0x110b, 0x110c, 0x131c, 0x131d, 0x3400, 0x3401, 0x3402, 0x2403, 0x2404, 0x181d, 0x3900, 0x3901, 0x3902, 0x2903, 0x2904, 0x2905, 0x1907};
    public static final Integer[] HOLIDAY_2001 = {0x3000, 0x1013, 0x1014, 0x3017, 0x3018, 0x3019, 0x201c, 0x201d, 0x131b, 0x131c, 0x3400, 0x3401, 0x3402, 0x2403, 0x2406, 0x181c, 0x181d, 0x3900, 0x3901, 0x3902, 0x2903, 0x2904, 0x1b1c, 0x1b1d};
    public static final Integer[] HOLIDAY_2002 = {0x3000, 0x2001, 0x2002, 0x1108, 0x1109, 0x310b, 0x310c, 0x310d, 0x210e, 0x2111, 0x131a, 0x131b, 0x3400, 0x3401, 0x3402, 0x2405, 0x2406, 0x181b, 0x181c, 0x3900, 0x3901, 0x3902, 0x2903, 0x2906};
    public static final Integer[] HOLIDAY_2003 = {0x3000, 0x3100, 0x3101, 0x3102, 0x2103, 0x2104, 0x2105, 0x2106, 0x1107, 0x1108, 0x1319, 0x131a, 0x3400, 0x3401, 0x3402, 0x2404, 0x2405, 0x2406, 0x181a, 0x181b, 0x3900, 0x3901, 0x3902, 0x2905, 0x2906};
    public static final Integer[] HOLIDAY_2004 = {0x3000, 0x1010, 0x1011, 0x3015, 0x3016, 0x3017, 0x2019, 0x201a, 0x201b, 0x3400, 0x3401, 0x3402, 0x2403, 0x2404, 0x2405, 0x2406, 0x1407, 0x1408, 0x3900, 0x3901, 0x3902, 0x2903, 0x2904, 0x2905, 0x2906, 0x1908, 0x1909};
    public static final Integer[] HOLIDAY_2005 = {0x3000, 0x2002, 0x1104, 0x1105, 0x3108, 0x3109, 0x310a, 0x210d, 0x210e, 0x131d, 0x3400, 0x3401, 0x3402, 0x2403, 0x2404, 0x2405, 0x1407, 0x3900, 0x3901, 0x3902, 0x2903, 0x2904, 0x2905, 0x2906, 0x1907, 0x1908, 0x1b1e};
    public static final Integer[] HOLIDAY_2006 = {0x3000, 0x2001, 0x2002, 0x101b, 0x301c, 0x301d, 0x301e, 0x2100, 0x2101, 0x2102, 0x1104, 0x131c, 0x131d, 0x3400, 0x3401, 0x3402, 0x2403, 0x2404, 0x181d, 0x3900, 0x3901, 0x3902, 0x2903, 0x2904, 0x2905, 0x1907, 0x1b1d, 0x1b1e};
    public static final Integer[] HOLIDAY_2007 = {0x3000, 0x2001, 0x2002, 0x1110, 0x3111, 0x3112, 0x3113, 0x2114, 0x2115, 0x2116, 0x1118, 0x131b, 0x131c, 0x3400, 0x3401, 0x3402, 0x2403, 0x2406, 0x181c, 0x181d, 0x3900, 0x3901, 0x3902, 0x2903, 0x2904, 0x1b1c, 0x2b1e};
    public static final Integer[] HOLIDAY_2008 = {0x3000, 0x1101, 0x1102, 0x3105, 0x3106, 0x3107, 0x210a, 0x210b, 0x3303, 0x3400, 0x2401, 0x1403, 0x3507, 0x2508, 0x380d, 0x280e, 0x181a, 0x181b, 0x281c, 0x281d, 0x3900, 0x3901, 0x3902};
    public static final Integer[] HOLIDAY_2009 = {0x3000, 0x2001, 0x1003, 0x1017, 0x3018, 0x3019, 0x301a, 0x201b, 0x201c, 0x201d, 0x1100, 0x3303, 0x2305, 0x3400, 0x341b, 0x241c, 0x141e, 0x181a, 0x3900, 0x3901, 0x3902, 0x2904, 0x3905, 0x2906, 0x2907, 0x1909};
    public static final Integer[] HOLIDAY_2010 = {0x3000, 0x310c, 0x310d, 0x310e, 0x210f, 0x2110, 0x2111, 0x2112, 0x1113, 0x1114, 0x3304, 0x3400, 0x2402, 0x150b, 0x150c, 0x250d, 0x250e, 0x350f, 0x1812, 0x3815, 0x2816, 0x2817, 0x1818, 0x1819, 0x3900, 0x3901, 0x3902, 0x2903, 0x2904, 0x2905, 0x2906, 0x1908};
    public static final Integer[] HOLIDAY_2011 = {0x3000, 0x2002, 0x101d, 0x3101, 0x3102, 0x3103, 0x2106, 0x2107, 0x110b, 0x1301, 0x3304, 0x3400, 0x2401, 0x3505, 0x380b, 0x3900, 0x3901, 0x3902, 0x2903, 0x2904, 0x2905, 0x2906, 0x1907, 0x1908, 0x1b1e};
    public static final Integer[] HOLIDAY_2012 = {0x3000, 0x2001, 0x2002, 0x1014, 0x3015, 0x3016, 0x3017, 0x2018, 0x2019, 0x201a, 0x101c, 0x121e, 0x1300, 0x2301, 0x2302, 0x3303, 0x131b, 0x231d, 0x3400, 0x2515, 0x3516, 0x181c, 0x381d, 0x3900, 0x3901, 0x3902, 0x2903, 0x2904};
    public static final Integer[] HOLIDAY_2013 = {0x3000, 0x2001, 0x2002, 0x1004, 0x1005, 0x3108, 0x3109, 0x310a, 0x210b, 0x210c, 0x210d, 0x210e, 0x110f, 0x1110, 0x3303, 0x2304, 0x1306, 0x131a, 0x131b, 0x231c, 0x231d, 0x3400, 0x1507, 0x1508, 0x2509, 0x250a, 0x350b, 0x3812, 0x2813, 0x1815, 0x181c, 0x3900, 0x3901, 0x3902, 0x2903, 0x2906, 0x190b};
    public static final Integer[] HOLIDAY_2014 = {0x3000, 0x1019, 0x301e, 0x3100, 0x3101, 0x2102, 0x2103, 0x2104, 0x2105, 0x1107, 0x3304, 0x2306, 0x3400, 0x2401, 0x1403, 0x3501, 0x3807, 0x181b, 0x3900, 0x3901, 0x3902, 0x2905, 0x2906, 0x190a};
    public static final Integer[] HOLIDAY_2015 = {0x3000, 0x2001, 0x1003, 0x110e, 0x3111, 0x3112, 0x3113, 0x2116, 0x2117, 0x111b, 0x3304, 0x2305, 0x3400, 0x3513, 0x2515, 0x3802, 0x2803, 0x1805, 0x381a, 0x3900, 0x3901, 0x3902, 0x2904, 0x2905, 0x2906, 0x1909};
    public static final Integer[] HOLIDAY_2016 = {0x3000, 0x1105, 0x3106, 0x3107, 0x3108, 0x2109, 0x210a, 0x210b, 0x110d, 0x3303, 0x3400, 0x2401, 0x3508, 0x2509, 0x250a, 0x150b, 0x380e, 0x280f, 0x2810, 0x1811, 0x3900, 0x3901, 0x3902, 0x2903, 0x2904, 0x2905, 0x2906, 0x1907, 0x1908};
    public static final Integer[] HOLIDAY_2017 = {0x3000, 0x1001, 0x1015, 0x301a, 0x301b, 0x301c, 0x201d, 0x201e, 0x2100, 0x2101, 0x1103, 0x1300, 0x2302, 0x3303, 0x3400, 0x141a, 0x241c, 0x341d, 0x181d, 0x3900, 0x3901, 0x3902, 0x3903, 0x2904, 0x2905};
    public static final Integer[] HOLIDAY_2018 = {0x3000, 0x110a, 0x210e, 0x310f, 0x3110, 0x3111, 0x2112, 0x2113, 0x2114, 0x1117, 0x3304, 0x2305, 0x1307, 0x131b, 0x231d, 0x3400, 0x3511, 0x3817, 0x181c, 0x181d, 0x3900, 0x3901, 0x3902, 0x2903, 0x2904, 0x1b1c, 0x2b1e};
    public static final Integer[] HOLIDAY_2019 = {0x3000, 0x1101, 0x1102, 0x2103, 0x3104, 0x3105, 0x3106, 0x2107, 0x3304, 0x131b, 0x3400, 0x2401, 0x2402, 0x1404, 0x3506, 0x380c, 0x181c, 0x3900, 0x3901, 0x3902, 0x2903, 0x2906, 0x190b};
    public static final Integer[] HOLIDAY_2020 = {0x3000, 0x1012, 0x2017, 0x3018, 0x3019, 0x301a, 0x201b, 0x201c, 0x201d, 0x1100, 0x3303, 0x2305, 0x1319, 0x3400, 0x2403, 0x2404, 0x1408, 0x3518, 0x2519, 0x151b, 0x181a, 0x3900, 0x3901, 0x3902, 0x2904, 0x2905, 0x2906, 0x2907, 0x1909};

    static void print(Integer[] holiday) {
        Arrays.sort(holiday, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if ((o1 & 0xf00) == (o2 & 0xf00)) {
                    return (o1 & 0xff) - (o2 & 0xff);
                } else {
                    return (o1 & 0xf00) - (o2 & 0xf00);
                }
            }
        });
        for (int date : holiday) {
            switch ((0xf000 & date)) {
                case 0x1000: {
                    System.out.println("补班日：" + (((0xf00 & date) >> 8) + 1) + "月" + ((0xff & date) + 1) + "日");
                }
                break;
                case 0x2000: {
                    System.out.println("调休日：" + (((0xf00 & date) >> 8) + 1) + "月" + ((0xff & date) + 1) + "日");
                }
                break;
                default: {
                    System.out.println("节假日：" + (((0xf00 & date) >> 8) + 1) + "月" + ((0xff & date) + 1) + "日");
                }
                break;
            }
        }
    }
}