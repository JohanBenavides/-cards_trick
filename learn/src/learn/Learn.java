/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;
import java.util.*;

// @author Moses Katsina

// All credits goes to Himanshu Bhandari & Aleksandar Stevanovic
// Himanshu Bhandari wrote this code in C++
// Aleksandar Stevanovic wrote this code in Python
// And I rewrote this code in Java.

// Special thanks to JC Chambers III
// he fixed the spacing error

public class Learn
{
    public static void main(String[] args)
    {
        System.out.println("Type in your name and see Magic! \n");

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();

        int nameLength = name.length();

        System.out.println("");

        for(int x = 0; x < nameLength; x++)        { 
        
        //SmallAlphabetHolder(name.toLowerCase(), x);
      BigAlphabetHolder(name.toUpperCase(), x);

}

        /*System.out.print("______________________________________\n");
        System.out.print("If you like it!!! Please hit one like.\n");*/
        System.out.print("______________________________________\n");
        System.out.print("**************************************");

    }

    private static void BigAlphabetHolder(String name, int x)
    {
        if (name.charAt(x) == 'A')
        {
            System.out.println("..######..\n..#....#..\n..######..\n..#....#..\n..#....#..\n");
        }

        else if (name.charAt(x) == 'B')
        {
            System.out.println("..######..\n..#....#..\n..#####...\n..#....#..\n..######..\n");
        }

        else if (name.charAt(x) == 'C')
        {
            System.out.println("..######..\n..#.......\n..#.......\n..#.......\n..######..\n");
        }

        else if (name.charAt(x) == 'D')
        {
            System.out.println("..#####...\n..#....#..\n..#....#..\n..#....#..\n..#####...\n");
        }

        else if (name.charAt(x) == 'E')
        {
            System.out.println("..######..\n..#.......\n..#####...\n..#.......\n..######..\n");
        }

        else if (name.charAt(x) == 'F')
        {
            System.out.println("..######..\n..#.......\n..#####...\n..#.......\n..#.......\n");
        }

        else if (name.charAt(x) == 'G')
        {
            System.out.println("..######..\n..#.......\n..#.####..\n..#....#..\n..######..\n");
        }

        else if (name.charAt(x) == 'H')
        {
            System.out.println("..#....#..\n..#....#..\n..######..\n..#....#..\n..#....#..\n");
        }

        else if (name.charAt(x) == 'I')
        {
            System.out.println("..######..\n....##....\n....##....\n....##....\n..######..\n");
        }

        else if (name.charAt(x) == 'J')
        {
            System.out.println("..######..\n....##....\n....##....\n..#.##....\n..####....\n");
        }

        else if (name.charAt(x) == 'K')
        {
            System.out.println("..#...#...\n..#..#....\n..##......\n..#..#....\n..#...#...\n");
        }

        else if (name.charAt(x) == 'L')
        {
            System.out.println("..#.......\n..#.......\n..#.......\n..#.......\n..######..\n");
        }

        else if (name.charAt(x) == 'M')
        {
            System.out.println("..#....#..\n..##..##..\n..#.##.#..\n..#....#..\n..#....#..\n");
        }

        else if (name.charAt(x) == 'N')
        {
            System.out.println("..#....#..\n..##...#..\n..#.#..#..\n..#..#.#..\n..#...##..\n");
        }

        else if (name.charAt(x) == 'O')
        {
            System.out.println("..######..\n..#....#..\n..#....#..\n..#....#..\n..######..\n");
        }

        else if (name.charAt(x) == 'P')
        {
            System.out.println("..######..\n..#....#..\n..######..\n..#.......\n..#.......\n");
        }

        else if (name.charAt(x) == 'Q')
        {
            System.out.println("..######..\n..#....#..\n..#.#..#..\n..#..#.#..\n..######..\n");
        }

        else if (name.charAt(x) == 'R')
        {
            System.out.println("..######..\n..#....#..\n..#.##...\n..#...#...\n..#....#..\n");
        }

        else if (name.charAt(x) == 'S')
        {
            System.out.println("..######..\n..#.......\n..######..\n.......#..\n..######..\n");
        }

        else if (name.charAt(x) == 'T')
        {
            System.out.println("..######..\n....##....\n....##....\n....##....\n....##....\n");
        }

        else if (name.charAt(x) == 'U')
        {
            System.out.println("..#....#..\n..#....#..\n..#....#..\n..#....#..\n..######..\n");
        }

        else if (name.charAt(x) == 'V')
        {
            System.out.println("..#....#..\n..#....#..\n..#....#..\n...#..#...\n....##....\n");
        }

        else if (name.charAt(x) == 'W')
        {
            System.out.println("..#....#..\n..#....#..\n..#.##.#..\n..##..##..\n..#....#..\n");
        }

        else if (name.charAt(x) == 'X')
        {
            System.out.println("..#....#..\n...#..#...\n....##....\n...#..#...\n..#....#..\n");
        }

        else if (name.charAt(x) == 'Y')
        {
            System.out.println("..#....#..\n...#..#...\n....##....\n....##....\n....##....\n");
        }

        else if (name.charAt(x) == 'Z')
        {
            System.out.println("..######..\n......#...\n.....#....\n....#.....\n..######..\n");
        }

        else if (name.charAt(x) == '.')
        {
            System.out.println("----..----\n");
        }
    }

    private static void SmallAlphabetHolder(String name, int x)
    {
        if (name.charAt(x) == 'a')
        {
            System.out.println("...#####..\n.......#..\n...#####..\n..#....#..\n...#####..\n");
        }

        else if (name.charAt(x) == 'b')
        {
            System.out.println("..#.......\n..#.......\n..#####...\n..#....#..\n..#####...\n");
        }

        else if (name.charAt(x) == 'c')
        {
            System.out.println("...####...\n..#....#..\n..#.......\n..#....#..\n...####...\n");
        }

        else if (name.charAt(x) == 'd')
        {
            System.out.println(".......#..\n.......#..\n...#####..\n..#....#..\n...#####..\n");
        }

        else if (name.charAt(x) == 'e')
        {
            System.out.println("...####...\n..#....#..\n..#####...\n..#.......\n...####...\n");
        }

        else if (name.charAt(x) == 'f')
        {
            System.out.println("...####...\n...#......\n..####....\n...#......\n...#......\n");
        }

        else if (name.charAt(x) == 'g')
        {
            System.out.println("...####...\n..#....#..\n...####...\n......#...\n...####...\n");
        }

        else if (name.charAt(x) == 'h')
        {
            System.out.println("..#.......\n..#.......\n..#####...\n..#...#...\n..#...#...\n");
        }

        else if (name.charAt(x) == 'i')
        {
            System.out.println(".....*....\n.....#....\n.....#....\n.....#....\n.....#....\n");
        }

        else if (name.charAt(x) == 'j')
        {
            System.out.println(".....*....\n.....#....\n.....#....\n..#..#....\n...##.....\n");
        }

        else if (name.charAt(x) == 'k')
        {
            System.out.println("...#......\n...#.#....\n...##.....\n...#.#....\n...#..#...\n");
        }

        else if (name.charAt(x) == 'l')
        {
            System.out.println("....#.....\n....#.....\n....#.....\n....#.....\n...####...\n");
        }

        else if (name.charAt(x) == 'm')
        {
            System.out.println("..........\n...#.#....\n..#.#.#...\n..#...#...\n..#...#...\n");
        }

        else if (name.charAt(x) == 'n')
        {
            System.out.println("..........\n...###....\n..#...#...\n..#...#...\n..#...#...\n");
        }

        else if (name.charAt(x) == 'o')
        {
            System.out.println("....###...\n...#...#..\n...#...#..\n...#...#..\n....###...\n");
        }

        else if (name.charAt(x) == 'p')
        {
            System.out.println("...####...\n...#...#..\n...####...\n...#......\n...#......\n");
        }

        else if (name.charAt(x) == 'q')
        {
            System.out.println("...####...\n..#....#..\n...#####..\n.......##.\n.......#..\n");
        }

        else if (name.charAt(x) == 'r')
        {
            System.out.println("...#.#....\n...##.....\n...#......\n...#......\n...#......\n");
        }

        else if (name.charAt(x) == 's')
        {
            System.out.println("..######..\n..#.......\n..######..\n.......#..\n..######..\n");
        }

        else if (name.charAt(x) == 't')
        {
            System.out.println("....#.....\n...####...\n....#.....\n....#.#...\n.....#....\n");
        }

        else if (name.charAt(x) == 'u')
        {
            System.out.println("..........\n...#...#..\n...#...#..\n...#...#..\n....###...\n");
        }

        else if (name.charAt(x) == 'v')
        {
            System.out.println("..........\n...#...#..\n...#...#..\n....#.#...\n.....#....\n");
        }

        else if (name.charAt(x) == 'w')
        {
            System.out.println("..........\n..#...#...\n..#...#...\n..#.#.#...\n...#.#....");
        }

        else if (name.charAt(x) == 'x')
        {
            System.out.println("..........\n....#.#...\n.....#....\n....#.#...\n..........\n");
        }

        else if (name.charAt(x) == 'y')
        {
            System.out.println("..........\n....#.#...\n....#.#...\n.....#....\n.....#....\n");
        }

        else if (name.charAt(x) == 'z')
        {
            System.out.println("..........\n...####...\n.....#....\n....#.....\n...####...\n");
        }
    }

}
