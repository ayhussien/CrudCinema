package com.org.crud.cinema.Bean;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

@ManagedBean
@ViewScoped
public class TreeBean {
	private TreeNode root;

	@PostConstruct
	public void init() {
		root = new DefaultTreeNode("Files", null);
		TreeNode node0 = new DefaultTreeNode("Jobs", root);

		TreeNode node00 = new DefaultTreeNode("HR", node0);
		TreeNode node01 = new DefaultTreeNode("IT", node0);

		node00.getChildren().add(new DefaultTreeNode("HR Manager"));
		node00.getChildren().add(new DefaultTreeNode("HR Assistantc"));
		node01.getChildren().add(new DefaultTreeNode("Java Developer"));
		node01.getChildren().add(new DefaultTreeNode("C++ Developer"));
		node01.getChildren().add(new DefaultTreeNode(".net Developer"));
	}

	public TreeNode getRoot() {
		return root;
	}

}