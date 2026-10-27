/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foodstorageapp;

/**
 *
 * @author pc
 */
public class FoodQueue extends AbstractFoodStorage{
    private FoodItem[] queue;
    private int front;
    private int rear;
    private int size;
   
    
    
    
    public FoodQueue(int capacity){
        super(capacity);
        queue = new FoodItem[capacity];
        
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
        
        public boolean enqueue(FoodItem food){
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
        
        public FoodItem dequeue(){
            if(isEmpty()){
                System.out.println("\nqueue is empty");
                System.out.println("there is no food item to remove");
                return null;
            }
            FoodItem removedFood = queue[front];
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
        public FoodItem peek(){
            if(isEmpty()){
                System.out.println("\nqueue is empty");
                System.out.println("there is no item at the front");
                return null;
            }
            return queue[front];
        }
        
        public void display(){
            if(isEmpty()){
                System.out.println("\nqueue is empty");
                return;
            }
            
            System.out.println("\n==============CIRCULAR QUEUE=============");
            
            for(int i= 0; i<size; i++){
                int index = (front + i )%capacity;
                System.out.println("\nposition: " + (i + 1));
                System.out.println("------------------------");
                queue[index].displayInfo();
            }
            System.out.println("\n=====================");
        }
        
        public void search(String foodName){
            if(isEmpty()){
                System.out.println("\nqueue is empty");
                return;
            }
            
            boolean found = false;
            
            for(int i = 0; i<size; i++){
                int index =(front + i)% capacity;
                
                if(queue[index].getName().equalsIgnoreCase(foodName)){
                    System.out.println("\nfood item found");
                    System.out.println("------------------------");
                    queue[index].displayInfo();
                    System.out.println("---------------------------");
                    found = true;
                }
            }
            if(!found){
                System.out.println("\nfood item not found");
            }
        }
    }
    
