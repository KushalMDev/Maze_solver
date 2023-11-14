/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maze_solver;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Kushal M
 */
public class DepthFirstSearch {
    static int count=0;
    public static boolean dfs(int[][] maze,int x,int y,List<Integer> path){
        int n=maze.length,m=maze[0].length;
        if(maze[x][y]==9){
            path.add(x);
            path.add(y);
            System.out.println("count is"+count );
            return true;
           
        }
        if(maze[x][y]==0){
           maze[x][y]=2;
           int dx=-1,dy=0;
           if(dfs(maze,x+dx,y+dy,path)){
               path.add(x);
            path.add(y);
            count++;
               return true;
           }
           dx=1;dy=0;
            if(dfs(maze,x+dx,y+dy,path)){
               path.add(x);
            path.add(y);
            count++;
               return true;
           }
            dx=0;dy=-1;
             if(dfs(maze,x+dx,y+dy,path)){
              path.add(x);
            path.add(y);
            count++;
               return true;
           }
             dx=0;dy=1;
              if(dfs(maze,x+dx,y+dy,path)){
             path.add(x);
            path.add(y);
            count++;
               return true;
           }
        }
        return false;
        
        
    }
}


