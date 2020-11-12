/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;
import java.util.List;
/**
 *
 * @author Home
 */
public abstract  class Constructure <EnityType> {
    public abstract void Insert(EnityType enity);
    public abstract void Delete(EnityType enity);
    public abstract void Update(EnityType enity);
    public abstract List<EnityType> Data();
    public abstract List<EnityType> Search(EnityType enity);
}
