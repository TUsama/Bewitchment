package com.bewitchment.client.render.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * hellhoundAlpha - cybercat5555
 * Created using Tabula 5.1.0
 */
public class ModelHellHoundAlpha extends ModelBase {
	public ModelRenderer body;
	public ModelRenderer lArm01;
	public ModelRenderer rArm01;
	public ModelRenderer lHindLeg01;
	public ModelRenderer rHindLeg;
	public ModelRenderer mane;
	public ModelRenderer neck;
	public ModelRenderer tailThin01;
	public ModelRenderer mane02;
	public ModelRenderer mane01;
	public ModelRenderer head;
	public ModelRenderer lEar;
	public ModelRenderer rEar;
	public ModelRenderer muzzle;
	public ModelRenderer lowerJaw;
	public ModelRenderer lHorn01;
	public ModelRenderer rHorn01;
	public ModelRenderer lHornTop01;
	public ModelRenderer rHornTop01;
	public ModelRenderer lTusk01;
	public ModelRenderer rTusk01;
	public ModelRenderer lTusk02;
	public ModelRenderer rTusk02;
	public ModelRenderer lHorn02;
	public ModelRenderer lHorn03a;
	public ModelRenderer lHorn03b;
	public ModelRenderer lHorn03c;
	public ModelRenderer lHorn03d;
	public ModelRenderer lHorn04a;
	public ModelRenderer lHorn04b;
	public ModelRenderer lHorn04c;
	public ModelRenderer lHorn04d;
	public ModelRenderer lHorn05a;
	public ModelRenderer lHorn05b;
	public ModelRenderer lHorn06;
	public ModelRenderer rHorn02;
	public ModelRenderer rHorn03a;
	public ModelRenderer rHorn03b;
	public ModelRenderer rHorn03c;
	public ModelRenderer rHorn03d;
	public ModelRenderer rHorn04a;
	public ModelRenderer rHorn04b;
	public ModelRenderer rHorn04c;
	public ModelRenderer rHorn04d;
	public ModelRenderer rHorn05a;
	public ModelRenderer rHorn05b;
	public ModelRenderer rHorn06;
	public ModelRenderer lHornTop02;
	public ModelRenderer lHornTop03a;
	public ModelRenderer lHornTop03b;
	public ModelRenderer lHorn03Topc;
	public ModelRenderer lHornTop03d;
	public ModelRenderer lHornTop04a;
	public ModelRenderer lHornTop04d;
	public ModelRenderer lHornTop05;
	public ModelRenderer rHornTop02;
	public ModelRenderer rHornTop03a;
	public ModelRenderer rHornTop03b;
	public ModelRenderer rHorn03Topc;
	public ModelRenderer rHornTop03d;
	public ModelRenderer rHornTop04a;
	public ModelRenderer rHornTop04b;
	public ModelRenderer rHornTop05;
	public ModelRenderer tailThin02;
	public ModelRenderer tailThin03;
	public ModelRenderer tailThin04;
	public ModelRenderer tailThin05;

	public ModelHellHoundAlpha() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.mane01 = new ModelRenderer(this, 0, 48);
		this.mane01.setRotationPoint(0.0F, -1.8F, -3.0F);
		this.mane01.addBox(-3.0F, -1.0F, 0.0F, 6, 2, 7, 0.0F);
		this.setRotateAngle(mane01, 0.4363323129985824F, 0.0F, 0.0F);
		this.tailThin01 = new ModelRenderer(this, 20, 33);
		this.tailThin01.setRotationPoint(0.0F, 6.8F, 2.2F);
		this.tailThin01.addBox(-0.5F, -0.5F, -0.5F, 1, 4, 1, 0.0F);
		this.setRotateAngle(tailThin01, -1.0471975511965976F, 0.0F, 0.0F);
		this.lHorn04c = new ModelRenderer(this, 57, 6);
		this.lHorn04c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn04c.addBox(-0.3F, -3.0F, -0.3F, 1, 3, 1, 0.0F);
		this.rHorn03d = new ModelRenderer(this, 52, 7);
		this.rHorn03d.mirror = true;
		this.rHorn03d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn03d.addBox(-0.8F, -2.0F, -0.2F, 1, 2, 1, 0.0F);
		this.lHorn04a = new ModelRenderer(this, 57, 6);
		this.lHorn04a.setRotationPoint(0.0F, -1.5F, -0.1F);
		this.lHorn04a.addBox(-0.3F, -3.0F, -0.7F, 1, 3, 1, 0.0F);
		this.setRotateAngle(lHorn04a, -0.6981317007977318F, 0.0F, 0.0F);
		this.muzzle = new ModelRenderer(this, 0, 10);
		this.muzzle.setRotationPoint(0.0F, 0.7F, -3.9F);
		this.muzzle.addBox(-1.5F, -1.0F, -3.0F, 3, 2, 3, 0.0F);
		this.rHornTop01 = new ModelRenderer(this, 45, 22);
		this.rHornTop01.mirror = true;
		this.rHornTop01.setRotationPoint(-0.9F, -2.4F, -0.6F);
		this.rHornTop01.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(rHornTop01, -0.2792526803190927F, 0.0F, -0.2792526803190927F);
		this.rHorn03a = new ModelRenderer(this, 52, 7);
		this.rHorn03a.mirror = true;
		this.rHorn03a.setRotationPoint(0.0F, -1.5F, -0.1F);
		this.rHorn03a.addBox(-0.2F, -2.0F, -0.8F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rHorn03a, -0.6981317007977318F, -0.20943951023931953F, 0.0F);
		this.lHorn03c = new ModelRenderer(this, 52, 7);
		this.lHorn03c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn03c.addBox(-0.2F, -2.0F, -0.2F, 1, 2, 1, 0.0F);
		this.rHorn03b = new ModelRenderer(this, 52, 7);
		this.rHorn03b.mirror = true;
		this.rHorn03b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn03b.addBox(-0.8F, -2.0F, -0.8F, 1, 2, 1, 0.0F);
		this.rHornTop05 = new ModelRenderer(this, 57, 32);
		this.rHornTop05.mirror = true;
		this.rHornTop05.setRotationPoint(0.0F, -2.9F, 0.0F);
		this.rHornTop05.addBox(-0.5F, -2.0F, -0.45F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rHornTop05, 0.0F, 0.0F, -0.2792526803190927F);
		this.rHornTop04b = new ModelRenderer(this, 57, 27);
		this.rHornTop04b.mirror = true;
		this.rHornTop04b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHornTop04b.addBox(-0.7F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		this.rHorn02 = new ModelRenderer(this, 55, 0);
		this.rHorn02.mirror = true;
		this.rHorn02.setRotationPoint(0.0F, -2.5F, -0.1F);
		this.rHorn02.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(rHorn02, -0.5235987755982988F, -0.17453292519943295F, 0.0F);
		this.lHornTop04d = new ModelRenderer(this, 57, 27);
		this.lHornTop04d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHornTop04d.addBox(-0.7F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		this.tailThin05 = new ModelRenderer(this, 44, 33);
		this.tailThin05.setRotationPoint(0.0F, 1.3F, 0.1F);
		this.tailThin05.addBox(-0.5F, -0.5F, -0.59F, 2, 2, 1, 0.0F);
		this.setRotateAngle(tailThin05, 0.0F, 0.0F, 0.7853981633974483F);
		this.lHornTop03a = new ModelRenderer(this, 52, 27);
		this.lHornTop03a.setRotationPoint(0.0F, -1.5F, -0.1F);
		this.lHornTop03a.addBox(-0.2F, -2.0F, -0.8F, 1, 2, 1, 0.0F);
		this.setRotateAngle(lHornTop03a, -0.10471975511965977F, 0.0F, 0.3490658503988659F);
		this.rEar = new ModelRenderer(this, 16, 14);
		this.rEar.mirror = true;
		this.rEar.setRotationPoint(-2.0F, -3.0F, -2.0F);
		this.rEar.addBox(-1.0F, -2.0F, -0.5F, 2, 2, 1, 0.0F);
		this.lTusk02 = new ModelRenderer(this, 23, 0);
		this.lTusk02.setRotationPoint(0.0F, -0.8F, 0.0F);
		this.lTusk02.addBox(-0.45F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(lTusk02, 0.0F, 0.0F, -0.3490658503988659F);
		this.rHorn04a = new ModelRenderer(this, 57, 6);
		this.rHorn04a.mirror = true;
		this.rHorn04a.setRotationPoint(0.0F, -1.5F, -0.1F);
		this.rHorn04a.addBox(-0.3F, -3.0F, -0.7F, 1, 3, 1, 0.0F);
		this.setRotateAngle(rHorn04a, -0.6981317007977318F, 0.0F, 0.0F);
		this.mane02 = new ModelRenderer(this, 28, 48);
		this.mane02.setRotationPoint(0.0F, -1.0F, 2.7F);
		this.mane02.addBox(-3.5F, -1.0F, 0.0F, 7, 2, 7, 0.0F);
		this.setRotateAngle(mane02, -1.2915436464758039F, 0.0F, 0.0F);
		this.mane = new ModelRenderer(this, 21, 0);
		this.mane.setRotationPoint(0.0F, -4.0F, 0.0F);
		this.mane.addBox(-4.0F, -3.5F, -3.01F, 8, 7, 7, 0.0F);
		this.lArm01 = new ModelRenderer(this, 0, 18);
		this.lArm01.setRotationPoint(1.5F, 16.0F, -4.0F);
		this.lArm01.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
		this.lHornTop03b = new ModelRenderer(this, 52, 27);
		this.lHornTop03b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHornTop03b.addBox(-0.8F, -2.0F, -0.8F, 1, 2, 1, 0.0F);
		this.rHornTop03a = new ModelRenderer(this, 52, 27);
		this.rHornTop03a.mirror = true;
		this.rHornTop03a.setRotationPoint(0.0F, -1.5F, -0.1F);
		this.rHornTop03a.addBox(-0.2F, -2.0F, -0.8F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rHornTop03a, -0.10471975511965977F, 0.0F, -0.3490658503988659F);
		this.rHornTop03b = new ModelRenderer(this, 52, 27);
		this.rHornTop03b.mirror = true;
		this.rHornTop03b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHornTop03b.addBox(-0.8F, -2.0F, -0.8F, 1, 2, 1, 0.0F);
		this.lHorn03a = new ModelRenderer(this, 52, 7);
		this.lHorn03a.setRotationPoint(0.0F, -1.5F, -0.1F);
		this.lHorn03a.addBox(-0.2F, -2.0F, -0.8F, 1, 2, 1, 0.0F);
		this.setRotateAngle(lHorn03a, -0.6981317007977318F, 0.20943951023931953F, 0.0F);
		this.rHindLeg = new ModelRenderer(this, 0, 18);
		this.rHindLeg.mirror = true;
		this.rHindLeg.setRotationPoint(-1.5F, 16.0F, 6.0F);
		this.rHindLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
		this.rHorn04c = new ModelRenderer(this, 57, 6);
		this.rHorn04c.mirror = true;
		this.rHorn04c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn04c.addBox(-0.3F, -3.0F, -0.3F, 1, 3, 1, 0.0F);
		this.head = new ModelRenderer(this, 0, 0);
		this.head.setRotationPoint(0.0F, 0.0F, -2.9F);
		this.head.addBox(-3.0F, -3.0F, -4.0F, 6, 6, 4, 0.0F);
		this.rHorn05a = new ModelRenderer(this, 52, 12);
		this.rHorn05a.mirror = true;
		this.rHorn05a.setRotationPoint(0.0F, -2.5F, -0.1F);
		this.rHorn05a.addBox(-0.5F, -3.0F, -0.7F, 1, 3, 1, 0.0F);
		this.setRotateAngle(rHorn05a, -0.6981317007977318F, -0.3490658503988659F, 0.0F);
		this.lHorn04b = new ModelRenderer(this, 57, 6);
		this.lHorn04b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn04b.addBox(-0.7F, -3.0F, -0.7F, 1, 3, 1, 0.0F);
		this.tailThin03 = new ModelRenderer(this, 32, 33);
		this.tailThin03.setRotationPoint(0.0F, 4.4F, 0.0F);
		this.tailThin03.addBox(-0.5F, -0.1F, -0.5F, 1, 5, 1, 0.0F);
		this.setRotateAngle(tailThin03, 0.20943951023931953F, 0.0F, 0.0F);
		this.lHorn02 = new ModelRenderer(this, 55, 0);
		this.lHorn02.setRotationPoint(0.0F, -2.5F, -0.1F);
		this.lHorn02.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(lHorn02, -0.5235987755982988F, 0.17453292519943295F, 0.0F);
		this.lHorn01 = new ModelRenderer(this, 46, 0);
		this.lHorn01.setRotationPoint(2.0F, -1.3F, -1.4F);
		this.lHorn01.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
		this.setRotateAngle(lHorn01, -1.0016444577195458F, 0.6108652381980153F, 0.0F);
		this.rHorn03c = new ModelRenderer(this, 52, 7);
		this.rHorn03c.mirror = true;
		this.rHorn03c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn03c.addBox(-0.2F, -2.0F, -0.2F, 1, 2, 1, 0.0F);
		this.rHorn04b = new ModelRenderer(this, 57, 6);
		this.rHorn04b.mirror = true;
		this.rHorn04b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn04b.addBox(-0.7F, -3.0F, -0.7F, 1, 3, 1, 0.0F);
		this.lowerJaw = new ModelRenderer(this, 0, 43);
		this.lowerJaw.setRotationPoint(0.0F, 2.0F, -3.8F);
		this.lowerJaw.addBox(-1.5F, -0.4F, -3.0F, 3, 1, 3, 0.0F);
		this.tailThin02 = new ModelRenderer(this, 26, 33);
		this.tailThin02.setRotationPoint(0.0F, 3.3F, 0.0F);
		this.tailThin02.addBox(-0.5F, -0.1F, -0.5F, 1, 5, 1, 0.0F);
		this.setRotateAngle(tailThin02, 0.27314402793711257F, 0.0F, 0.0F);
		this.tailThin04 = new ModelRenderer(this, 37, 33);
		this.tailThin04.setRotationPoint(0.0F, 4.3F, 0.0F);
		this.tailThin04.addBox(-1.0F, -0.1F, -0.5F, 2, 2, 1, 0.0F);
		this.setRotateAngle(tailThin04, 0.20943951023931953F, 0.0F, 0.0F);
		this.rHornTop03d = new ModelRenderer(this, 52, 27);
		this.rHornTop03d.mirror = true;
		this.rHornTop03d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHornTop03d.addBox(-0.8F, -2.0F, -0.2F, 1, 2, 1, 0.0F);
		this.lTusk01 = new ModelRenderer(this, 23, 1);
		this.lTusk01.setRotationPoint(1.1F, -0.1F, -1.5F);
		this.lTusk01.addBox(-0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F);
		this.setRotateAngle(lTusk01, 0.0F, 0.0F, 0.6981317007977318F);
		this.lHornTop04a = new ModelRenderer(this, 57, 27);
		this.lHornTop04a.setRotationPoint(0.0F, -1.7F, -0.0F);
		this.lHornTop04a.addBox(-0.3F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(lHornTop04a, -0.10471975511965977F, 0.0F, 0.3490658503988659F);
		this.lHorn05a = new ModelRenderer(this, 52, 12);
		this.lHorn05a.setRotationPoint(0.0F, -2.5F, -0.1F);
		this.lHorn05a.addBox(-0.5F, -3.0F, -0.7F, 1, 3, 1, 0.0F);
		this.setRotateAngle(lHorn05a, -0.6981317007977318F, 0.3490658503988659F, 0.0F);
		this.rHorn01 = new ModelRenderer(this, 46, 0);
		this.rHorn01.mirror = true;
		this.rHorn01.setRotationPoint(-2.0F, -1.3F, -1.4F);
		this.rHorn01.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
		this.setRotateAngle(rHorn01, -1.0016444577195458F, -0.6108652381980153F, 0.0F);
		this.rTusk02 = new ModelRenderer(this, 23, 0);
		this.rTusk02.mirror = true;
		this.rTusk02.setRotationPoint(0.0F, -0.8F, 0.0F);
		this.rTusk02.addBox(-0.55F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rTusk02, 0.0F, 0.0F, 0.3490658503988659F);
		this.lHornTop01 = new ModelRenderer(this, 45, 22);
		this.lHornTop01.setRotationPoint(0.9F, -2.4F, -0.6F);
		this.lHornTop01.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(lHornTop01, -0.2792526803190927F, 0.0F, 0.2792526803190927F);
		this.rHornTop04a = new ModelRenderer(this, 57, 27);
		this.rHornTop04a.mirror = true;
		this.rHornTop04a.setRotationPoint(0.0F, -1.7F, -0.0F);
		this.rHornTop04a.addBox(-0.3F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(rHornTop04a, -0.10471975511965977F, 0.0F, -0.3490658503988659F);
		this.lHindLeg01 = new ModelRenderer(this, 0, 18);
		this.lHindLeg01.setRotationPoint(1.5F, 16.0F, 6.0F);
		this.lHindLeg01.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
		this.lHornTop03d = new ModelRenderer(this, 52, 27);
		this.lHornTop03d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHornTop03d.addBox(-0.8F, -2.0F, -0.2F, 1, 2, 1, 0.0F);
		this.lHorn03d = new ModelRenderer(this, 52, 7);
		this.lHorn03d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn03d.addBox(-0.8F, -2.0F, -0.2F, 1, 2, 1, 0.0F);
		this.rHorn04d = new ModelRenderer(this, 57, 6);
		this.rHorn04d.mirror = true;
		this.rHorn04d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn04d.addBox(-0.7F, -3.0F, -0.3F, 1, 3, 1, 0.0F);
		this.lHorn06 = new ModelRenderer(this, 58, 13);
		this.lHorn06.setRotationPoint(0.0F, -2.7F, 0.0F);
		this.lHorn06.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(lHorn06, -0.6283185307179586F, 0.0F, 0.0F);
		this.rTusk01 = new ModelRenderer(this, 23, 1);
		this.rTusk01.mirror = true;
		this.rTusk01.setRotationPoint(-1.1F, -0.1F, -1.5F);
		this.rTusk01.addBox(-0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F);
		this.setRotateAngle(rTusk01, 0.0F, 0.0F, -0.6981317007977318F);
		this.lHorn04d = new ModelRenderer(this, 57, 6);
		this.lHorn04d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn04d.addBox(-0.7F, -3.0F, -0.3F, 1, 3, 1, 0.0F);
		this.lHorn03Topc = new ModelRenderer(this, 52, 27);
		this.lHorn03Topc.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn03Topc.addBox(-0.2F, -2.0F, -0.2F, 1, 2, 1, 0.0F);
		this.body = new ModelRenderer(this, 18, 14);
		this.body.setRotationPoint(0.0F, 14.0F, 1.0F);
		this.body.addBox(-3.0F, -2.0F, -3.0F, 6, 9, 6, 0.0F);
		this.setRotateAngle(body, 1.5707963267948966F, 0.0F, 0.0F);
		this.lHorn03b = new ModelRenderer(this, 52, 7);
		this.lHorn03b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn03b.addBox(-0.8F, -2.0F, -0.8F, 1, 2, 1, 0.0F);
		this.lHorn05b = new ModelRenderer(this, 52, 12);
		this.lHorn05b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn05b.addBox(-0.5F, -3.0F, -0.3F, 1, 3, 1, 0.0F);
		this.neck = new ModelRenderer(this, 0, 32);
		this.neck.setRotationPoint(0.0F, -5.4F, 0.5F);
		this.neck.addBox(-2.5F, -2.5F, -4.0F, 5, 5, 4, 0.0F);
		this.setRotateAngle(neck, -1.5707963267948966F, 0.0F, 0.0F);
		this.rHorn06 = new ModelRenderer(this, 58, 13);
		this.rHorn06.mirror = true;
		this.rHorn06.setRotationPoint(0.0F, -2.7F, 0.0F);
		this.rHorn06.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(rHorn06, -0.6283185307179586F, 0.0F, 0.0F);
		this.rHorn03Topc = new ModelRenderer(this, 52, 27);
		this.rHorn03Topc.mirror = true;
		this.rHorn03Topc.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn03Topc.addBox(-0.2F, -2.0F, -0.2F, 1, 2, 1, 0.0F);
		this.lHornTop02 = new ModelRenderer(this, 55, 21);
		this.lHornTop02.setRotationPoint(0.0F, -1.6F, 0.0F);
		this.lHornTop02.addBox(-1.0F, -1.8F, -1.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(lHornTop02, -0.17453292519943295F, 0.0F, 0.2617993877991494F);
		this.rHorn05b = new ModelRenderer(this, 52, 12);
		this.rHorn05b.mirror = true;
		this.rHorn05b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn05b.addBox(-0.5F, -3.0F, -0.3F, 1, 3, 1, 0.0F);
		this.lHornTop05 = new ModelRenderer(this, 57, 32);
		this.lHornTop05.setRotationPoint(0.0F, -2.7F, 0.0F);
		this.lHornTop05.addBox(-0.5F, -2.0F, -0.45F, 1, 2, 1, 0.0F);
		this.setRotateAngle(lHornTop05, 0.0F, 0.0F, 0.2792526803190927F);
		this.rArm01 = new ModelRenderer(this, 0, 18);
		this.rArm01.mirror = true;
		this.rArm01.setRotationPoint(-1.5F, 16.0F, -4.0F);
		this.rArm01.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
		this.rHornTop02 = new ModelRenderer(this, 55, 21);
		this.rHornTop02.mirror = true;
		this.rHornTop02.setRotationPoint(0.0F, -1.6F, 0.0F);
		this.rHornTop02.addBox(-1.0F, -1.8F, -1.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(rHornTop02, -0.17453292519943295F, 0.0F, -0.2617993877991494F);
		this.lEar = new ModelRenderer(this, 16, 14);
		this.lEar.setRotationPoint(2.0F, -3.0F, -2.0F);
		this.lEar.addBox(-1.0F, -2.0F, -0.5F, 2, 2, 1, 0.0F);
		this.neck.addChild(this.mane01);
		this.body.addChild(this.tailThin01);
		this.lHorn04a.addChild(this.lHorn04c);
		this.rHorn03a.addChild(this.rHorn03d);
		this.lHorn03a.addChild(this.lHorn04a);
		this.head.addChild(this.muzzle);
		this.head.addChild(this.rHornTop01);
		this.rHorn02.addChild(this.rHorn03a);
		this.lHorn03a.addChild(this.lHorn03c);
		this.rHorn03a.addChild(this.rHorn03b);
		this.rHornTop04a.addChild(this.rHornTop05);
		this.rHornTop04a.addChild(this.rHornTop04b);
		this.rHorn01.addChild(this.rHorn02);
		this.lHornTop04a.addChild(this.lHornTop04d);
		this.tailThin04.addChild(this.tailThin05);
		this.lHornTop02.addChild(this.lHornTop03a);
		this.head.addChild(this.rEar);
		this.lTusk01.addChild(this.lTusk02);
		this.rHorn03a.addChild(this.rHorn04a);
		this.mane.addChild(this.mane02);
		this.body.addChild(this.mane);
		this.lHornTop03a.addChild(this.lHornTop03b);
		this.rHornTop02.addChild(this.rHornTop03a);
		this.rHornTop03a.addChild(this.rHornTop03b);
		this.lHorn02.addChild(this.lHorn03a);
		this.rHorn04a.addChild(this.rHorn04c);
		this.neck.addChild(this.head);
		this.rHorn04a.addChild(this.rHorn05a);
		this.lHorn04a.addChild(this.lHorn04b);
		this.tailThin02.addChild(this.tailThin03);
		this.lHorn01.addChild(this.lHorn02);
		this.head.addChild(this.lHorn01);
		this.rHorn03a.addChild(this.rHorn03c);
		this.rHorn04a.addChild(this.rHorn04b);
		this.head.addChild(this.lowerJaw);
		this.tailThin01.addChild(this.tailThin02);
		this.tailThin03.addChild(this.tailThin04);
		this.rHornTop03a.addChild(this.rHornTop03d);
		this.lowerJaw.addChild(this.lTusk01);
		this.lHornTop03a.addChild(this.lHornTop04a);
		this.lHorn04a.addChild(this.lHorn05a);
		this.head.addChild(this.rHorn01);
		this.rTusk01.addChild(this.rTusk02);
		this.head.addChild(this.lHornTop01);
		this.rHornTop03a.addChild(this.rHornTop04a);
		this.lHornTop03a.addChild(this.lHornTop03d);
		this.lHorn03a.addChild(this.lHorn03d);
		this.rHorn04a.addChild(this.rHorn04d);
		this.lHorn05a.addChild(this.lHorn06);
		this.lowerJaw.addChild(this.rTusk01);
		this.lHorn04a.addChild(this.lHorn04d);
		this.lHornTop03a.addChild(this.lHorn03Topc);
		this.lHorn03a.addChild(this.lHorn03b);
		this.lHorn05a.addChild(this.lHorn05b);
		this.body.addChild(this.neck);
		this.rHorn05a.addChild(this.rHorn06);
		this.rHornTop03a.addChild(this.rHorn03Topc);
		this.lHornTop01.addChild(this.lHornTop02);
		this.rHorn05a.addChild(this.rHorn05b);
		this.lHornTop04a.addChild(this.lHornTop05);
		this.rHornTop01.addChild(this.rHornTop02);
		this.head.addChild(this.lEar);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.lArm01.render(f5);
		this.rHindLeg.render(f5);
		this.lHindLeg01.render(f5);
		this.body.render(f5);
		this.rArm01.render(f5);
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
