package com.api.aeteris.response;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author suman.kumari
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ProductDetailsResponse implements Serializable{
	private static final long serialVersionUID = 1L;
	//@JsonIgnore
	  @JsonProperty("old_api_id")
	    private String oldApiId;
	    @JsonProperty("item_id")
	    private String itemId;
	    @JsonProperty("item_name")
	    private String itemName;
	    @JsonProperty("leg_loc_id")
	    private int legLocId;
	    @JsonProperty("brand_id")
	    private String brandId;
	    @JsonProperty("brand_name")
	    private String brandName;
	    @JsonProperty("item_description")
	    private String itemDescription;
	    @JsonProperty("updated_at")
	    private Date updatedAt;
	    @JsonProperty("nf_ingredient_statement")
	    private String nfIngredientStatement;
	    @JsonProperty("nf_water_grams")
	    private String nfWaterGrams;
	    @JsonProperty("nf_calories")
	    private int nfCalories;
	    @JsonProperty("nf_calories_from_fat")
	    private int nfCaloriesFromFat;
	    @JsonProperty("nf_total_fat")
	    private int nfTotalFat;
	    @JsonProperty("nf_saturated_fat")
	    private String nfSaturatedFat;
	    @JsonProperty("nf_trans_fatty_acid")
	    private String nfTransFattyAcid;
	    @JsonProperty("nf_polyunsaturated_fat")
	    private String nfPolyunsaturatedFat;
	    @JsonProperty("nf_monounsaturated_fat")
	    private String nfMonounsaturatedFat;
	    @JsonProperty("nf_cholesterol")
	    private String nfCholesterol;
	    @JsonProperty("nf_sodium")
	    private int nfSodium;
	    @JsonProperty("nf_total_carbohydrate")
	    private int nfTotalCarbohydrate;
	    @JsonProperty("nf_dietary_fiber")
	    private String nfDietaryFiber;
	    @JsonProperty("nf_sugars")
	    private int nfSugars;
	    @JsonProperty("nf_protein")
	    private int nfProtein;
	    @JsonProperty("nf_vitamin_a_dv")
	    private int nfVitaminADv;
	    @JsonProperty("nf_vitamin_c_dv")
	    private int nfVitaminCDv;
	    @JsonProperty("nf_calcium_dv")
	    private int nfCalciumDv;
	    @JsonProperty("nf_iron_dv")
	    private int nfIronDv;
	    @JsonProperty("nf_refuse_pct")
	    private String nfRefusePct;
	    @JsonProperty("nf_servings_per_container")
	    private int nfServingsPerContainer;
	    @JsonProperty("nf_serving_size_qty")
	    private int nfServingSizeQty;
	    @JsonProperty("nf_serving_size_unit")
	    private String nfServingSizeUnit;
	    @JsonProperty("nf_serving_weight_grams")
	    private String nfServingWeightGrams;
	    @JsonProperty("allergen_contains_milk")
	    private String allergenContainsMilk;
	    @JsonProperty("allergen_contains_eggs")
	    private String allergenContainsEggs;
	    @JsonProperty("allergen_contains_fish")
	    private String allergenContainsFish;
	    @JsonProperty("allergen_contains_shellfish")
	    private String allergenContainsShellfish;
	    @JsonProperty("allergen_contains_tree_nuts")
	    private String allergenContainsTreeNuts;
	    @JsonProperty("allergen_contains_peanuts")
	    private String allergenContainsPeanuts;
	    @JsonProperty("allergen_contains_wheat")
	    private String allergenContainsWheat;
	    @JsonProperty("allergen_contains_soybeans")
	    private String allergenContainsSoybeans;
	    @JsonProperty("allergen_contains_gluten")
	    private String allergenContainsGluten;
	    @JsonProperty("usda_fields")
	    private String usdaFields;
	    public void setOldApiId(String oldApiId) {
	         this.oldApiId = oldApiId;
	     }
	     public String getOldApiId() {
	         return oldApiId;
	     }

	    public void setItemId(String itemId) {
	         this.itemId = itemId;
	     }
	     public String getItemId() {
	         return itemId;
	     }

	    public void setItemName(String itemName) {
	         this.itemName = itemName;
	     }
	     public String getItemName() {
	         return itemName;
	     }

	    public void setLegLocId(int legLocId) {
	         this.legLocId = legLocId;
	     }
	     public int getLegLocId() {
	         return legLocId;
	     }

	    public void setBrandId(String brandId) {
	         this.brandId = brandId;
	     }
	     public String getBrandId() {
	         return brandId;
	     }

	    public void setBrandName(String brandName) {
	         this.brandName = brandName;
	     }
	     public String getBrandName() {
	         return brandName;
	     }

	    public void setItemDescription(String itemDescription) {
	         this.itemDescription = itemDescription;
	     }
	     public String getItemDescription() {
	         return itemDescription;
	     }

	    public void setUpdatedAt(Date updatedAt) {
	         this.updatedAt = updatedAt;
	     }
	     public Date getUpdatedAt() {
	         return updatedAt;
	     }

	    public void setNfIngredientStatement(String nfIngredientStatement) {
	         this.nfIngredientStatement = nfIngredientStatement;
	     }
	     public String getNfIngredientStatement() {
	         return nfIngredientStatement;
	     }

	    public void setNfWaterGrams(String nfWaterGrams) {
	         this.nfWaterGrams = nfWaterGrams;
	     }
	     public String getNfWaterGrams() {
	         return nfWaterGrams;
	     }

	    public void setNfCalories(int nfCalories) {
	         this.nfCalories = nfCalories;
	     }
	     public int getNfCalories() {
	         return nfCalories;
	     }

	    public void setNfCaloriesFromFat(int nfCaloriesFromFat) {
	         this.nfCaloriesFromFat = nfCaloriesFromFat;
	     }
	     public int getNfCaloriesFromFat() {
	         return nfCaloriesFromFat;
	     }

	    public void setNfTotalFat(int nfTotalFat) {
	         this.nfTotalFat = nfTotalFat;
	     }
	     public int getNfTotalFat() {
	         return nfTotalFat;
	     }

	    public void setNfSaturatedFat(String nfSaturatedFat) {
	         this.nfSaturatedFat = nfSaturatedFat;
	     }
	     public String getNfSaturatedFat() {
	         return nfSaturatedFat;
	     }

	    public void setNfTransFattyAcid(String nfTransFattyAcid) {
	         this.nfTransFattyAcid = nfTransFattyAcid;
	     }
	     public String getNfTransFattyAcid() {
	         return nfTransFattyAcid;
	     }

	    public void setNfPolyunsaturatedFat(String nfPolyunsaturatedFat) {
	         this.nfPolyunsaturatedFat = nfPolyunsaturatedFat;
	     }
	     public String getNfPolyunsaturatedFat() {
	         return nfPolyunsaturatedFat;
	     }

	    public void setNfMonounsaturatedFat(String nfMonounsaturatedFat) {
	         this.nfMonounsaturatedFat = nfMonounsaturatedFat;
	     }
	     public String getNfMonounsaturatedFat() {
	         return nfMonounsaturatedFat;
	     }

	    public void setNfCholesterol(String nfCholesterol) {
	         this.nfCholesterol = nfCholesterol;
	     }
	     public String getNfCholesterol() {
	         return nfCholesterol;
	     }

	    public void setNfSodium(int nfSodium) {
	         this.nfSodium = nfSodium;
	     }
	     public int getNfSodium() {
	         return nfSodium;
	     }

	    public void setNfTotalCarbohydrate(int nfTotalCarbohydrate) {
	         this.nfTotalCarbohydrate = nfTotalCarbohydrate;
	     }
	     public int getNfTotalCarbohydrate() {
	         return nfTotalCarbohydrate;
	     }

	    public void setNfDietaryFiber(String nfDietaryFiber) {
	         this.nfDietaryFiber = nfDietaryFiber;
	     }
	     public String getNfDietaryFiber() {
	         return nfDietaryFiber;
	     }

	    public void setNfSugars(int nfSugars) {
	         this.nfSugars = nfSugars;
	     }
	     public int getNfSugars() {
	         return nfSugars;
	     }

	    public void setNfProtein(int nfProtein) {
	         this.nfProtein = nfProtein;
	     }
	     public int getNfProtein() {
	         return nfProtein;
	     }

	    public void setNfVitaminADv(int nfVitaminADv) {
	         this.nfVitaminADv = nfVitaminADv;
	     }
	     public int getNfVitaminADv() {
	         return nfVitaminADv;
	     }

	    public void setNfVitaminCDv(int nfVitaminCDv) {
	         this.nfVitaminCDv = nfVitaminCDv;
	     }
	     public int getNfVitaminCDv() {
	         return nfVitaminCDv;
	     }

	    public void setNfCalciumDv(int nfCalciumDv) {
	         this.nfCalciumDv = nfCalciumDv;
	     }
	     public int getNfCalciumDv() {
	         return nfCalciumDv;
	     }

	    public void setNfIronDv(int nfIronDv) {
	         this.nfIronDv = nfIronDv;
	     }
	     public int getNfIronDv() {
	         return nfIronDv;
	     }

	    public void setNfRefusePct(String nfRefusePct) {
	         this.nfRefusePct = nfRefusePct;
	     }
	     public String getNfRefusePct() {
	         return nfRefusePct;
	     }

	    public void setNfServingsPerContainer(int nfServingsPerContainer) {
	         this.nfServingsPerContainer = nfServingsPerContainer;
	     }
	     public int getNfServingsPerContainer() {
	         return nfServingsPerContainer;
	     }

	    public void setNfServingSizeQty(int nfServingSizeQty) {
	         this.nfServingSizeQty = nfServingSizeQty;
	     }
	     public int getNfServingSizeQty() {
	         return nfServingSizeQty;
	     }

	    public void setNfServingSizeUnit(String nfServingSizeUnit) {
	         this.nfServingSizeUnit = nfServingSizeUnit;
	     }
	     public String getNfServingSizeUnit() {
	         return nfServingSizeUnit;
	     }

	    public void setNfServingWeightGrams(String nfServingWeightGrams) {
	         this.nfServingWeightGrams = nfServingWeightGrams;
	     }
	     public String getNfServingWeightGrams() {
	         return nfServingWeightGrams;
	     }

	    public void setAllergenContainsMilk(String allergenContainsMilk) {
	         this.allergenContainsMilk = allergenContainsMilk;
	     }
	     public String getAllergenContainsMilk() {
	         return allergenContainsMilk;
	     }

	    public void setAllergenContainsEggs(String allergenContainsEggs) {
	         this.allergenContainsEggs = allergenContainsEggs;
	     }
	     public String getAllergenContainsEggs() {
	         return allergenContainsEggs;
	     }

	    public void setAllergenContainsFish(String allergenContainsFish) {
	         this.allergenContainsFish = allergenContainsFish;
	     }
	     public String getAllergenContainsFish() {
	         return allergenContainsFish;
	     }

	    public void setAllergenContainsShellfish(String allergenContainsShellfish) {
	         this.allergenContainsShellfish = allergenContainsShellfish;
	     }
	     public String getAllergenContainsShellfish() {
	         return allergenContainsShellfish;
	     }

	    public void setAllergenContainsTreeNuts(String allergenContainsTreeNuts) {
	         this.allergenContainsTreeNuts = allergenContainsTreeNuts;
	     }
	     public String getAllergenContainsTreeNuts() {
	         return allergenContainsTreeNuts;
	     }

	    public void setAllergenContainsPeanuts(String allergenContainsPeanuts) {
	         this.allergenContainsPeanuts = allergenContainsPeanuts;
	     }
	     public String getAllergenContainsPeanuts() {
	         return allergenContainsPeanuts;
	     }

	    public void setAllergenContainsWheat(String allergenContainsWheat) {
	         this.allergenContainsWheat = allergenContainsWheat;
	     }
	     public String getAllergenContainsWheat() {
	         return allergenContainsWheat;
	     }

	    public void setAllergenContainsSoybeans(String allergenContainsSoybeans) {
	         this.allergenContainsSoybeans = allergenContainsSoybeans;
	     }
	     public String getAllergenContainsSoybeans() {
	         return allergenContainsSoybeans;
	     }

	    public void setAllergenContainsGluten(String allergenContainsGluten) {
	         this.allergenContainsGluten = allergenContainsGluten;
	     }
	     public String getAllergenContainsGluten() {
	         return allergenContainsGluten;
	     }

	    public void setUsdaFields(String usdaFields) {
	         this.usdaFields = usdaFields;
	     }
	     public String getUsdaFields() {
	         return usdaFields;
	     }

	
}
