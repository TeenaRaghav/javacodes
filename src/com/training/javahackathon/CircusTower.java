package com.training.javahackathon;
import java.util.*;
class Person implements Comparable<Person> {
	int height;
	int weight;

	public Person(int height, int weight) {
		this.height = height;
		this.weight = weight;
	}

	@Override
	public int compareTo(Person other) {
		// TODO Auto-generated method stub
		if (this.height != other.height) {
			return this.height - other.height;
		} else {
			return this.weight - other.weight;
		}
	}

	public String toString() {
		return "(" + height + "," + weight + ")";

	}
}

public class CircusTower {	
	public static List<Person> findLongestTower(List<Person> people){
		Collections.sort(people);
		List<List<Person>> solutions = new ArrayList<>();
		
		for(int i = 0; i < people.size(); i++) {
			List<Person> longestSeqAtIndex = new ArrayList<>();
			for(int j = 0; j < i; j++) {
				if(people.get(i).height > people.get(j).height && people.get(i).weight > people.get(j).weight
						&& solutions.get(j).size() > longestSeqAtIndex.size()) {
					longestSeqAtIndex = solutions.get(j);
				}
			}
			List<Person> newSolution = new ArrayList<>(longestSeqAtIndex);
			newSolution.add(people.get(i));
			solutions.add(newSolution);
		}
			List<Person> longestSeq  = new ArrayList<>();
			for(List<Person> seq : solutions) {
				if(seq.size() > longestSeq.size()) {
					longestSeq = seq;
				}
			}
			return longestSeq;
		}
	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person(65, 100));
		people.add(new Person(70, 150));
		people.add(new Person(56, 90));
		people.add(new Person(75, 190));
		people.add(new Person(60, 95));
		people.add(new Person(68, 110));
		
		List<Person> tower = findLongestTower(people);
		System.out.println("The Longest tower is length " + tower.size() + "and includes from top to bottom");
		for(Person person: tower) {
			System.out.println(person);
		}
	}
}
