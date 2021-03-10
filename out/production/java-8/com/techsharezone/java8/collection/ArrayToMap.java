class ArrayToMap{
  
  final String str = "s,a,u,r,a,b,h,s,h,a,r,m,a";
  final String arr[] = str.split(",");
  
  final Map<String, Integer> map = new HashMap<>();
  
  IntStream.range(0, arr.length)
           .forEach(index -> map.put(arr[index], index));
  System.out.println(map);
}
