package com.example.demoImmobilierBack.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "DBFile")
public class DBFile {
	
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String id;

    @Column(name = "FILENAME")
    private String fileName;

    @Column(name = "FILETYPE")
    private String fileType;
    
    @ManyToOne
    @JoinColumn(name="PRODUIT_IMMOBILIER_ID")
    private ProduitImmobilier produitImmobilier;

    @Lob
    @Column(name = "CONTENU_LOB")
    private byte[] data;

    public DBFile() {

    }

    public DBFile(String fileName, String fileType, byte[] data) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.data = data;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public ProduitImmobilier getProduitImmobilier() {
		return produitImmobilier;
	}

	public void setProduitImmobilier(ProduitImmobilier produitImmobilier) {
		this.produitImmobilier = produitImmobilier;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

    // Getters and Setters (Omitted for brevity)
    
}