/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maze_solver;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Kushal M
 */
public class BreadthFirstSearch {
    static class Pair{
    int row,col,distance;
    Pair(int r,int c,int d){
        row=r;
        col=c;
        distance=d;
    }
}
    public static void bfs(int[][] maze,int x,int y,List<Integer> path){
        int n=maze.length,m=maze[0].length;
        boolean vis[][]=new boolean[n][m];
        int[][]  distance=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                distance[i][j]=Integer.MAX_VALUE;
            }
        }
        distance[x][y]=0;
        vis[x][y]=true;
        path.add(x);
        path.add(y);
       PriorityQueue<Pair> pq=new PriorityQueue<Pair>((a,b)->a.distance-b.distance);
        pq.add(new Pair(x,y,0));
        while(!pq.isEmpty()){
            Pair p=pq.poll();
            int r=p.row,c=p.col,d=p.distance;
            if(maze[r][c]==9){System.out.println("dist os "+distance[8][11]);return ;}
            int[] dirx={0,1,0,-1};
            int[] diry={1,0,-1,0};
            for(int i=0;i<4;i++){
                int nx=r+dirx[i];
                int ny=c+diry[i];
               int newd=d+1;
                if(maze[nx][ny]!=1 && !vis[nx][ny] && newd<distance[nx][ny]){
                    pq.add(new Pair(nx,ny,newd));
                    distance[nx][ny]=newd;
                    path.add(nx);
                    path.add(ny);
                    vis[nx][ny]=true;
                }
            }
            
        }
        System.out.println("dist os "+distance[8][11]);
        
        
    }
}

