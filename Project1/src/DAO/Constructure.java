/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.util.List;
/**
 *
 * @author Home
 */
public abstract  class Constructure <EnityType, type > {
    public abstract void Insert(EnityType enity);
    public abstract void Delete(EnityType enity);
    public abstract void Update(EnityType enity);
    public abstract List<EnityType> Data();
    public abstract List<EnityType> Search(type type);
}
