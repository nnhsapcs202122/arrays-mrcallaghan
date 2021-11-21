
/**
 * A class of static factory methods for Big Team Conference data.
 *
 * @author gcschmit
 * @version 02jun2020
 */
public class BigTenData
{
    private static final City[] cities = new City[] {
            new City(42.0450722, -87.6876969, "Northwestern", "Evanston, IL"),
            new City(39.165325, -86.5263857, "Indiana", "Bloomington, IN"),
            new City(38.9896967, -76.93776, "Maryland", "College Park, MD"),
            new City(42.2808256, -83.7430378, "Michigan", "Ann Arbor, MI"),
            new City(42.7369792, -84.4838654, "Michigan State", "East Lansing, MI"),
            new City(39.9611755, -82.9987942, "Ohio State", "Columbus, OH"),
            new City(40.7933949, -77.8600012, "Penn State", "State College, PA"),
            new City(40.4862157, -74.4518188, "Rutgers", "New Brunswick, NJ"),
            new City(40.1164204, -88.2433829, "Illinois", "Champaign, IL"),
            new City(41.6611277, -91.5301683, "Iowa", "Iowa City, IA"),
            new City(44.977753, -93.2650108, "Minnesota", "Minneapolis, MN"),
            new City(40.813616, -96.7025955, "Nebraska", "Lincoln, NE"),
            new City(40.4258686, -86.9080655, "Purdue", "West Lafayette, IN"),
            new City(43.0730517, -89.4012302, "Wisconsin", "Madison, WI")
        };
        
    private static final double[][] distanceMatrix = new double[][]{
            { 0, 252.140545751, 715.964171443, 259.04894852900003, 238.303856323, 376.294821148, 585.074234406, 800.62410608, 155.288690723, 228.977077613, 406.04109366, 529.547279104, 142.764336847, 144.335162735, },
            { 244.668559476, 0, 624.085769899, 315.926764385, 306.251396544, 225.353241941, 547.012153801, 747.953593265, 154.213097522, 395.246015277, 634.311051075, 658.387313212, 112.79996311400001, 372.604498779, },
            { 715.496900451, 624.243598133, 0, 520.920785511, 586.542534079, 399.956007457, 196.75588440800001, 189.986047363, 695.553998206, 903.715147319, 1105.1387706790001, 1204.28534881, 640.269377594, 843.432839754, },
            { 258.619581168, 316.118146653, 521.40483352, 0, 65.654681231, 188.807306576, 390.51489648300003, 606.064768157, 343.027239179, 445.923791295, 648.261451396, 746.493992786, 257.084794798, 386.5548991, },
            { 239.522986225, 308.724453124, 586.628283277, 64.888530788, 0, 254.030756333, 455.73834624, 671.288217914, 323.931265607, 426.827817723, 629.165477824, 727.398019214, 249.198354066, 367.458925528, },
            { 373.320318171, 225.425942348, 399.219682822, 190.125855838, 255.747604406, 0, 322.873692165, 523.815753, 296.736342421, 537.769881547, 762.9621883990001, 813.888512817, 241.451721809, 501.256257474, },
            { 584.283229123, 546.306897716, 196.947888047, 389.706492812, 455.32824138, 322.018685669, 0, 229.163488913, 617.617297789, 772.50085462, 973.925099351, 1073.071677482, 535.345291905, 712.219168426, },
            { 801.184582722, 747.253929519, 190.90443370100002, 606.607846411, 672.229594979, 522.966338843, 230.890278922, 0, 818.564329592, 989.402208219, 1190.82645295, 1289.973031081, 763.27970898, 929.119900654, },
            { 152.502463159, 169.097418456, 696.082784927, 340.414995495, 319.669903289, 297.35087834, 619.009168829, 820.678855105, 0, 243.960817907, 512.470139911, 517.141607089, 91.103551907, 250.764208986, },
            { 229.21319859300002, 409.699104737, 903.96431709, 445.81940096700004, 425.074308761, 537.952564621, 773.074380053, 988.624251727, 243.2046094, 0, 302.575987079, 303.360778652, 324.422148697, 174.84758569000002, },
            { 405.327759752, 640.187977993, 1104.461476289, 647.545632004, 626.800539798, 764.34225339, 973.571539252, 1189.121410926, 511.037879756, 281.645104944, 0, 433.844960426, 530.811769089, 268.485709906, },
            { 529.895246864, 658.745844279, 1204.64574399, 752.788481016, 725.755735661, 814.255743078, 1080.044081473, 1289.3056786270001, 516.833407073, 309.614877767, 432.111335336, 0, 625.103575597, 487.795497501, },
            { 139.971274202, 114.221659962, 636.380837876, 257.428412961, 247.209966866, 238.375935359, 537.464788386, 760.976286683, 91.00599666000001, 324.76576686, 529.61314443, 625.335968351, 0, 267.907213505, },
            { 144.31403612100002, 379.174254362, 843.447752658, 386.531908373, 365.786816167, 503.328529759, 712.557815621, 928.107687295, 250.024156125, 174.631969953, 273.077020225, 480.432872522, 269.798045458, 0, },
    };
        
    /**
     * Returns an array of references to City objects in the Big Ten Conference
     * 
     * @return an array of references to City objects in the Big Ten Conference
     */
    public static City[] getCities()
    {
        /*
         * obtained via Google Maps JavaScript API, Distance Matrix Service
         */
        return cities;
    }

    /**
     * Returns a 2D array of distances (in miles) between cities in the Big Ten Conference.
     *  The rows and columns in this 2D array correspond to the cities returned by the
     *      getBigTen method.
     *      
     *  For example, to get the distance between Michigan (index 3) and Ohio State (index 5),
     *      find the value in the 2D array at row 3 and column 5, which is 189 miles.
     *      Note that the almost same value is at row 5 and column 3 (190 miles). There are
     *      small differences as these values were determined using the Google Maps API,
     *      which doesn't always return the same distance if the start and end locations
     *      are swapped.
     *      
     *  @return a 2D array of distances between cities in the Big Ten Conference
     */
    public static double[][] getDistanceMatrix()
    {
        /*
         * obtained via Google Maps JavaScript API, Distance Matrix Service
         */
        return distanceMatrix;
    }
}