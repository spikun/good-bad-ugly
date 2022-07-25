## Sum of shorts
Java has an integer cache. By default JVM will store Integer objects in the range of -128 to 127 in the cache to reuse the objects.
Summing two shorts and storing in a short will cause some complition error.