/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testingproject;

/**
 *
 * @author pc
 */
public class foodQueue {
    private foodItem[] queue;
    private int front;
    private int rear;
    private int size;
    private final int capacity;
    
    
    
    public foodQueue(int capacity){
        this.capacity = capacity;
        queue = new foodItem[capacity];
        
        front = -1;
        rear = -1;
        size = 0;
    }
        
        public boolean isEmpty(){
            return size == 0;
        }
        
        public boolean isFull(){
            return size == capacity;
        }
        
        public boolean enqueue(foodItem food){
            if(isFull()){
                System.out.println("\nQueue is full");
                System.out.println("Maximum capacity is 8");
                
                return false;
            }
            
            if(isEmpty()){
                front = 0;
                rear = 0;
            }else{
                rear = (rear+1) % capacity;
            }
            queue[rear]= food;
            size++;
            System.out.println("\nFood item added to queue");
            return true;
        }
        
        public foodItem dequeue(){
            if(isEmpty()){
                System.out.println("\nqueue is empty");
                System.out.println("there is no food item to remove");
                return null;
            }
            foodItem removedFood = queue[front];
            queue[front]= null;
            
            if(size == 1){
                front= -1;
                rear = -1;
            }else{
                front= (front +1)%capacity;
            }
            size--;
            return removedFood;
        }
        
    }
    
