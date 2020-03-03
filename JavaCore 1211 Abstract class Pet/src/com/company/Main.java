package com.company;

/*

1211 Abstract class Pet

If a class has at least one unrealized method declared directly in it or inherited from the parent class, then the class is considered abstract.

Abstract class Pet
Make the Pet class abstract.

Requirements:
1. The program should not display text on the screen.
2. The class Pet must be static.
3. The class Pet must be abstract.
4. The Pet class must have one getName () method.


 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) {

    }

    public abstract static class Pet {
        public String getName() {

            return "Я - котенок";
        }
    }

}
