/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observer;

/**
 *
 * @author Michal
 */
 import java.util.ArrayList;
 import java.util.List;

 public class Publisher {

 public interface Subscriber{
 void action(int x);
 }

 List<Subscriber> subscribers = new ArrayList<>();

 public void add(Subscriber subscriber){
 subscribers.add(subscriber);
 }

 public void remove(Subscriber subscriber){
 subscribers.remove(subscriber);
 }

 public void notifySubscribers(int x){
 subscribers.forEach(subscriber -> subscriber.action(x));
 }
 }