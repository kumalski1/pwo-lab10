/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flyweight;
        
 import java.util.List;
 import java.util.ArrayList;

 public class ParticleFactory {

 private final List<State> states = new ArrayList();

 Particle createParticle(double x, double y,
 String color, String texture){

 State state = null;

 for(State s : states){
 if(s.color.equals(color) && s.texture.equals(texture)){
 state = s;
 break;
 }
 }

 if(state==null){
 state = new State(color, texture);
 states.add(state);
 }

 return new Particle(new Context(x,y), state);
 }

 int getNumberOfStates() { return states.size(); }
 }